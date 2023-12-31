package com.example.springTraining;

import com.example.springTraining.configs.UseScheduled;
import com.example.springTraining.dao.UserDao;
import com.example.springTraining.domain.UserDomain;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class SpringTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTrainingApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserDao userDao, UseScheduled useScheduled){
		return args -> {

			List<UserDomain> allUsers =  userDao.findAll();
			System.out.println("There is: "+allUsers.size()+ " Users on database.\n");

			useScheduled.testScheduling();

		};

	}
}