package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Investment;
import com.example.pidev_finance.entities.Transaction;
import com.example.pidev_finance.repositories.IInvestmentRepository;
import com.example.pidev_finance.repositories.ITransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService{
    private ITransactionRepository ItransactionRepository;
    private IInvestmentRepository iinvestmentRepository;
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
    public Transaction assignTransactionToInvestment(Integer id_transaction,Integer id_invest){
        Transaction transaction=ItransactionRepository.findById(id_transaction).orElse(null);
        Investment investment = iinvestmentRepository.findById(id_invest).orElse(null);
        transaction.setInvestment(investment);
        return ItransactionRepository.save(transaction);
    }

}
