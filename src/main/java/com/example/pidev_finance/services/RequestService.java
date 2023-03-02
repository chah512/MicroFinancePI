package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Event;
import com.example.pidev_finance.entities.Request;

import java.util.List;

public interface RequestService {
    List<Request> retrieveAllRequests();
    Request AddRequest(Request request);
    void removeRequest(Integer numRequest);
    Request retrieveRequest(Integer numRequest);
    Request updateRequest(Request request);
}
