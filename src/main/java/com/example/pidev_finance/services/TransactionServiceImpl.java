package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Investissement;
import com.example.pidev_finance.entities.Transaction;
import com.example.pidev_finance.repositories.IInvestissementRepository;
import com.example.pidev_finance.repositories.ITransactionRepository;

import java.util.List;

public class TransactionServiceImpl implements TransactionService{
    private ITransactionRepository ItransactionRepository;
    private IInvestissementRepository IinvestissementRepository;
    @Override
    public List<Transaction> retrieveAllTransactions(){
        return ItransactionRepository.findAll();
    }
    @Override
    public Transaction AddTransaction(Transaction transaction){
        return  ItransactionRepository.save(transaction);
    }
    @Override
   public void removeTransaction(Integer numTransaction){
        ItransactionRepository.deleteById(numTransaction);
   }
   @Override
    public Transaction retrieveTransaction(Integer numTransaction){
        return ItransactionRepository.findById(numTransaction).orElse(null);
    }
    @Override
    public Transaction updateTransaction(Transaction transaction){
        return ItransactionRepository.save(transaction);
    }
    @Override
    public Transaction assignTransactionToInvestissement(Integer id_transaction,Integer id_invest){
        Transaction transaction=ItransactionRepository.findById(id_transaction).orElse(null);
        Investissement investissement=IinvestissementRepository.findById(id_invest).orElse(null);
        transaction.setInvestissement(investissement);
        return ItransactionRepository.save(transaction);
    }
}
