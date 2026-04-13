package com.example.SpringBootLearning1;

import org.springframework.stereotype.Component;

//@Component
public class RazorpayPaymentService implements PaymentService{

    @Override
    public String pay(){
        String payment="Razorpay Payment";
        System.out.println("Payment from: "+payment);
        return payment;
    }

}
