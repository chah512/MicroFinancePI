package com.example.pidev_finance.controllers;

import com.example.pidev_finance.entities.Event;
import com.example.pidev_finance.entities.Transaction;
import com.example.pidev_finance.services.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Transaction")
public class TransactionRestController {
    private TransactionService transactionService;

    @PostMapping("/add")
    Transaction AddTransaction(@RequestBody Transaction transaction){
      return transactionService.AddTransaction(transaction);
    }
    @GetMapping("/all")
    List<Transaction> retrieveAllTransactions(){
        return  transactionService.retrieveAllTransactions();
    }
    @GetMapping("/get/{id}")
    Transaction retrieveTransaction(@PathVariable("id") Integer id_transaction){
        return transactionService.retrieveTransaction(id_transaction);
    }
    @DeleteMapping("/delete/{id}")
    void removeTransaction(@PathVariable("id") Integer id_transaction){
        transactionService.removeTransaction(id_transaction);
    }
    @PutMapping("/update")
    Transaction updateTransaction(@RequestBody Transaction transaction){
        return transactionService.updateTransaction(transaction);
    }
    @GetMapping("/assigntrtoinv/{id_transaction}/{id_invest}")
    Transaction assignTransactionToInvestissement(@PathVariable("id_transaction") Integer id_transaction,@PathVariable("id_invest") Integer id_invest){
   return transactionService.assignTransactionToInvestissement(id_transaction,id_invest);
    }
}
