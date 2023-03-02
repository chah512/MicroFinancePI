package com.example.pidev_finance.controllers;

import com.example.pidev_finance.entities.Investissement;

import com.example.pidev_finance.services.InvestissementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Investissement")
public class InvestissementRestController {
    private InvestissementService investissementService;

    @PostMapping("/add")
    Investissement AddInvestissement(@RequestBody Investissement investissement){
        return investissementService.AddInvestissement(investissement);
    }
    @GetMapping("/all")
    List<Investissement> retrieveAllInvestissements(){

        return investissementService.retrieveAllInvestissements();
    }
    @GetMapping("/get/{id}")
   Investissement retrieveInvestissement(@PathVariable("id") Integer numInvestissement){
        return investissementService.retrieveInvestissement(numInvestissement);
    }
    @DeleteMapping("/delete/{id}")
    void RemoveInvestissement(@PathVariable("id") Integer numInvestissement){
        investissementService.RemoveInvestissement(numInvestissement);
    }
    @PutMapping ("/update")
    Investissement UpdateInvestissement(@RequestBody Investissement investissement){
        return investissementService.UpdateInvestissement(investissement);
    }
}
