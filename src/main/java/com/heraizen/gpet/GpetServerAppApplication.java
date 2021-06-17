package com.heraizen.gpet;
import java.util.HashMap;
import java.util.Map;

import com.heraizen.gpet.domain.ServiceCategory;
import com.heraizen.gpet.repo.ServiceCategoryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GpetServerAppApplication implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(GpetServerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}
}
