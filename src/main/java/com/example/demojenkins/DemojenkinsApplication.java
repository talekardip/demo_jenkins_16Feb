package com.example.demojenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemojenkinsApplication {

	public static int add(int a,int b){
		return a+b;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemojenkinsApplication.class, args);

		System.out.println(add(1,2));
	}

}
