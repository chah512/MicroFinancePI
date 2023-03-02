package com.example.pidev_finance.repositories;

import com.example.pidev_finance.entities.Investissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInvestissementRepository extends JpaRepository<Investissement,Integer> {
}
