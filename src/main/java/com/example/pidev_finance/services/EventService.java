package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Event;

import java.util.List;

public interface EventService {
    List<Event> retrieveAllEvents();
    Event AddEvent(Event event);
    void removeEvent(Integer numEvent);
    Event retrieveEvent(Integer numEvent);
    Event updateEvent(Event event);
}
