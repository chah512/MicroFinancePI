package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Investissement;
import com.example.pidev_finance.repositories.IInvestissementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InvestissementServiceImpl implements InvestissementService {
    private IInvestissementRepository IinvestissementRepository;

    @Override
    public List<Investissement> retrieveAllInvestissements(){
        return IinvestissementRepository.findAll();
    }
    @Override
    public Investissement AddInvestissement(Investissement investissement){
        return IinvestissementRepository.save(investissement);
    }
    @Override
    public void RemoveInvestissement(Integer numInvestissement){
        IinvestissementRepository.deleteById(numInvestissement);
    }
    @Override
    public Investissement retrieveInvestissement(Integer numInvestissement){
        return IinvestissementRepository.findById(numInvestissement).orElse(null);
    }
    @Override
    public Investissement UpdateInvestissement(Investissement investissement){
        return IinvestissementRepository.save(investissement);
    }
}
