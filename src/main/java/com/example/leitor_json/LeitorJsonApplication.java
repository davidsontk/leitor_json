package com.example.leitor_json;

import com.example.leitor_json.service.LeitorJSONService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeitorJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeitorJsonApplication.class, args);
	}

}
