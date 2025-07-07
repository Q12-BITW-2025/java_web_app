package com.example.bitw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class BitwOdigoApplication {


	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}


	public static void main(String[] args) {
		SpringApplication.run(BitwOdigoApplication.class, args);
	}

}
