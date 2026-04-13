package com.example.SpringBootLearning1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearning1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearning1Application.class, args);
	}


	private final PaymentService paymentService;


	public SpringBootLearning1Application(PaymentService paymentService) {              // currently there are 2 bean // razor & stripe // but i have to choose 1
		this.paymentService = paymentService;                                           // i did comment out one bean ( @component) // comment out from RazorPayment.. // now one bean present->stripe
	}                                                                                   // loosely coupled // don't need to tell separately that when we use which bean

	@Override
	public void run(String... args)throws Exception{
		String payment=paymentService.pay();
		System.out.println("Payment done: "+payment);

}
}
