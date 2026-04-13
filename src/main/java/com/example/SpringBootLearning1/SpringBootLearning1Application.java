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

	@Autowired        // field injection
	private RazorpayPaymentService paymentService;     // don't need to use new to create object // after creating bean(@component) autometic object created

	       // Dependency injection
//	public SpringBootLearning1Application(RazorpayPaymentService paymentService) {      //  add this autometic // alt+insert ->constructor->select paymentService
//		this.paymentService = paymentService;
//	}

	@Override
	public void run(String... args)throws Exception{
		String payment=paymentService.pay();
		System.out.println("Payment done: "+payment);

}
}
