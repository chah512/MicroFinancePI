package com.example.pidev_finance.repositories;

import com.example.pidev_finance.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface IEventRepository extends CrudRepository<Event,Integer> {
}
