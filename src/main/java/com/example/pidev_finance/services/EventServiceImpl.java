package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Event;
import com.example.pidev_finance.repositories.IEventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {

private IEventRepository Ieventrepository;
    @Override
    public List<Event> retrieveAllEvents() {
        return Ieventrepository.findAll();
    }

    @Override
    public Event AddEvent(Event event)
    {
        return Ieventrepository.save(event);
    }

    @Override
    public void removeEvent(Integer numEvent) {
       Ieventrepository.deleteById(numEvent);
    }

    @Override
    public Event retrieveEvent(Integer numEvent) {
        return Ieventrepository.findById(numEvent).orElse(null);
    }

    @Override
    public Event updateEvent(Event event) {
        return Ieventrepository.save(event);
    }
}
