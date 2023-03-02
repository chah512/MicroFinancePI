package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Event;
import com.example.pidev_finance.entities.Investissement;

import java.util.List;

public interface InvestissementService {
    List<Investissement> retrieveAllInvestissements();
    Investissement AddInvestissement(Investissement investissement);
    void RemoveInvestissement(Integer numInvestissement);
    Investissement retrieveInvestissement(Integer numInvestissement);
    Investissement UpdateInvestissement(Investissement investissement);
}
