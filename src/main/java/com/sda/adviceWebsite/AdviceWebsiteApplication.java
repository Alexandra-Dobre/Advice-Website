package com.sda.adviceWebsite;

import com.sda.adviceWebsite.entity.User;
import com.sda.adviceWebsite.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class AdviceWebsiteApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run =
				SpringApplication.run(AdviceWebsiteApplication.class, args);

		System.out.println("------------ User ----------");
		UserRepository userRepository = run.getBean(UserRepository.class);

		User byUserId = userRepository.findByUserId(3);
		System.out.println(byUserId);

	}

}
