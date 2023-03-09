package com.example.pidev_finance.repositories;

import com.example.pidev_finance.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ITransactionRepository extends JpaRepository<Transaction,Integer> {

}
