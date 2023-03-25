package com.example.pidev_finance.services;

import com.example.pidev_finance.entities.Investment;
import com.example.pidev_finance.entities.User;
import com.example.pidev_finance.repositories.IInvestmentRepository;
import com.example.pidev_finance.repositories.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class InvestmentServiceImpl implements InvestmentService {
    private IInvestmentRepository iinvestmentRepository;
    private IUserRepository userRepository;

    @Override
    public List<Investment> retrieveAllInvestissements(){
        return iinvestmentRepository.findAll();
    }
    @Override
    public Investment AddInvestissement(Investment investment){
        return iinvestmentRepository.save(investment);
    }
    @Override
    public void RemoveInvestissement(Integer numInvestissement){
        iinvestmentRepository.deleteById(numInvestissement);
    }
    @Override
    public Investment retrieveInvestissement(Integer numInvestissement){
        return iinvestmentRepository.findById(numInvestissement).orElse(null);
    }
    @Override
    public Investment UpdateInvestissement(Investment investment){
        return iinvestmentRepository.save(investment);
    }

    public void pret(Integer userId, Float amount,Integer investmentPeriodInMonths) {
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
        Float userAmount = user.getAmount();
        if (userAmount < amount) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        user.setAmount(userAmount - amount);
        userRepository.save(user);

        Investment investment = new Investment();
        investment.setId_client(userId);
        investment.setAmount_inv(amount);
        Date investDate = new Date();
        investment.setDate_inv(investDate);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(investDate);
    calendar.add(Calendar.MONTH, investmentPeriodInMonths);
    Date endDate= calendar.getTime();
        investment.setDate_fin(endDate);
        iinvestmentRepository.save(investment);
    }

    @Transactional
    @Scheduled(fixedDelay = 86400000)
    public void checkInvestments() {
    List<Investment> investments = iinvestmentRepository.findByDateFinBeforeAndWithdrawnFalse(new Date());
    for (Investment investment : investments) {
    withdraw(investment.getId_invest());
    }
    }
    public void withdraw(Integer investmentId) {
    Investment investment = iinvestmentRepository.findById(investmentId)
    .orElseThrow(() -> new IllegalArgumentException("Investment not found"));
    User user = userRepository.findById(investment.getId_client())
    .orElseThrow(() -> new IllegalArgumentException("User not found"));
    Float investedAmount = investment.getAmount_inv();
    Float finalAmount = investedAmount * 1.1f;
    user.setAmount(user.getAmount() + finalAmount);
    userRepository.save(user);
    iinvestmentRepository.delete(investment);
    }

}
