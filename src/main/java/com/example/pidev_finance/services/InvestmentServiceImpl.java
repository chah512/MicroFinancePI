package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Investment;
import com.example.pidev_finance.repositories.IInvestmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class InvestmentServiceImpl implements InvestmentService {
    private IInvestmentRepository iinvestissementRepository;

    @Override
    public List<Investment> retrieveAllInvestissements(){
        return iinvestissementRepository.findAll();
    }
    @Override
    public Investment AddInvestissement(Investment investment){
        return iinvestissementRepository.save(investment);
    }
    @Override
    public void RemoveInvestissement(Integer numInvestissement){
        iinvestissementRepository.deleteById(numInvestissement);
    }
    @Override
    public Investment retrieveInvestissement(Integer numInvestissement){
        return iinvestissementRepository.findById(numInvestissement).orElse(null);
    }
    @Override
    public Investment UpdateInvestissement(Investment investment){
        return iinvestissementRepository.save(investment);
    }
}
