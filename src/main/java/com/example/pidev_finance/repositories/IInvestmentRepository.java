package com.example.pidev_finance.repositories;

import com.example.pidev_finance.entities.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInvestmentRepository extends JpaRepository<Investment,Integer> {
}
