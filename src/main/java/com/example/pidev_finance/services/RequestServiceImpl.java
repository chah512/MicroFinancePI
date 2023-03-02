package com.example.pidev_finance.services;



import com.example.pidev_finance.entities.Offers_Credit;
import com.example.pidev_finance.entities.Request;

import com.example.pidev_finance.repositories.IOffers_CreditRepository;
import com.example.pidev_finance.repositories.IRequestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RequestServiceImpl implements RequestService {
    private IRequestRepository IRequestrepository;
    @Override
    public List<Request>retrieveAllRequests() {
        return IRequestrepository.findAll();
    }

    @Override
    public Request AddRequest(Request request) {
        return IRequestrepository.save(request);
    }

    @Override
    public void removeRequest(Integer numRequest) {
        IRequestrepository.deleteById(numRequest);
    }

    @Override
    public Request retrieveRequest(Integer numRequest) {
        return IRequestrepository.findById(numRequest).orElse(null);
    }

    @Override
    public Request updateRequest(Request request) {
        return IRequestrepository.save(request);
    }

}


