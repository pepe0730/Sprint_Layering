package com.example.layering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.layering.domain.Customer;
import com.example.layering.service.CustomerService;

@SpringBootApplication
public class LayeringApplication implements CommandLineRunner {
	@Autowired
	CustomerService customerService;
	
	@Override
	public void run(String...strings) throws Exception {
		customerService.save(new Customer(1, "Nobita", "Nobi"));
		customerService.save(new Customer(2, "Takeshi", "Goda"));
		customerService.save(new Customer(3, "Suneo", "Honekawa"));
		
		customerService.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(LayeringApplication.class, args);
	}

}
