package com.example.pidev_finance.repositories;

import com.example.pidev_finance.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRequestRepository extends JpaRepository<Request,Integer> {
}