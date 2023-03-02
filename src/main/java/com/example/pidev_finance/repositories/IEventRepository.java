package com.example.pidev_finance.repositories;

import com.example.pidev_finance.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IEventRepository extends JpaRepository<Event,Integer> {
}
