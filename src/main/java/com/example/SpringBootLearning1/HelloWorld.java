package com.example.SpringBootLearning1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public String hello(){
        System.out.println("checking");       // this don't show on browser // this shows on terminal/console
        return "checking";                   // RestController use return to show something on browser
    }

//      public void hello(){
//        System.out.println("check");         // this don't show on browser // this show on terminal/console
//      }

//      public void hello(){
//        int a=5;
//        int b=8;
//        int c=a+b;
//        System.out.println("sum="+c);
//       }

//      public int hello(){
//        int a=5;
//        int b=8;
//        int c=a+b;
//        return c;
//    }
}
