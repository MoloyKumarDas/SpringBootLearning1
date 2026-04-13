package com.example.SpringBootLearning1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Component
//@Service      // just to be familiar with others annotation
//@RestController
//@Repository
//@Controller
public class StripePaymentService implements PaymentService{
    @Override
    public String pay() {
        String payment="Stripe Payment";
        System.out.println("Payment from: "+payment);
        return payment;

    }
}
