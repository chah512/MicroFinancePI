package com.example.pidev_finance.repositories;

import com.example.pidev_finance.entities.ShareHolder;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IShareholderRepository extends JpaRepository<ShareHolder,Integer> {
}
