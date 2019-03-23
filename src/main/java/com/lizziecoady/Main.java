package com.lizziecoady;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Tells spring that this is a springboot application, makes sure spring recognises the beans
// and configures all the annotations
@SpringBootApplication
public class Main {

//    our main method
//    parameter is Main.class showing we want to run from the Main class
//    parameter args is if we are passing any arguments from the command line (if any)
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

}

// when we run it, look at the console and find the get methods being used
