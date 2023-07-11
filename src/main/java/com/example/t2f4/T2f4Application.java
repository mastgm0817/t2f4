package com.example.t2f4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class T2f4Application {

	@GetMapping("/welcome")
	public String welcome(){
		return "바로테스트";
	}
	public static void main(String[] args) {
		SpringApplication.run(T2f4Application.class, args);
	}


// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/mastgm0817/t2f4.git
// git push -u origin main

}
