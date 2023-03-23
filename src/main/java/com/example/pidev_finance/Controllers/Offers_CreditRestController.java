package com.example.pidev_finance.Controllers;

import com.example.pidev_finance.entities.Offers_Credit;
import com.example.pidev_finance.services.Offers_CreditService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Offers_Credit")
public class Offers_CreditRestController {
    private Offers_CreditService offers_creditService;

    @PostMapping("/add")
    Offers_Credit addOffers_Credit(@RequestBody Offers_Credit offers_credit){
        return offers_creditService.AddOffers_Credit(offers_credit);
    }
    @GetMapping("/all")
    List<Offers_Credit> retrieveAllOffers_Credits(){

        return offers_creditService.retrieveAllOffers_Credits();
    }
    @GetMapping("/get/{id}")
    Offers_Credit retrieveOffers_Credit(@PathVariable("id") Integer Id_offer){
        return offers_creditService.retrieveOffers_Credit(Id_offer);
    }
    @DeleteMapping("/delete/{id}")
    void RemoveOffers_Credit(@PathVariable("id") Integer Id_offer){
        offers_creditService.removeOffers_Credit(Id_offer);
    }
    @PutMapping ("/update")
    Offers_Credit updateOffers_Credit(@RequestBody Offers_Credit offers_credit){
        return offers_creditService.updateOffers_Credit(offers_credit);
    }
}
