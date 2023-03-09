package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Offers_Credit;

import java.util.List;

public interface Offers_CreditService {
    List<Offers_Credit> retrieveAllOffers_Credits();
    Offers_Credit AddOffers_Credit(Offers_Credit offers_credit);
    void removeOffers_Credit(Integer numOffers_Credit);
    Offers_Credit retrieveOffers_Credit(Integer numOffers_Credit);
    Offers_Credit updateOffers_Credit(Offers_Credit offers_credit);
}
