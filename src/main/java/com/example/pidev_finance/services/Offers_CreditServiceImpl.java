package com.example.pidev_finance.services;
import com.example.pidev_finance.entities.Offers_Credit;
import com.example.pidev_finance.repositories.IOffers_CreditRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class Offers_CreditServiceImpl implements Offers_CreditService{
    private IOffers_CreditRepository Ioffers_creditrepository;
    @Override
    public List<Offers_Credit> retrieveAllOffers_Credits() {
        return Ioffers_creditrepository.findAll();
    }

    @Override
    public Offers_Credit AddOffers_Credit(Offers_Credit offers_credit) {
        return Ioffers_creditrepository.save(offers_credit);
    }

    @Override
    public void removeOffers_Credit(Integer numOffers_Credit) {
        Ioffers_creditrepository.deleteById(numOffers_Credit);
    }

    @Override
    public Offers_Credit retrieveOffers_Credit(Integer numOffers_Credit) {
        return Ioffers_creditrepository.findById(numOffers_Credit).orElse(null);
    }

    @Override
    public Offers_Credit updateOffers_Credit(Offers_Credit offers_credit) {
        return Ioffers_creditrepository.save(offers_credit);
    }

}
