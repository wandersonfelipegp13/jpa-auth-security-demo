package dev.wande.jpaauthsecurity;

import dev.wande.jpaauthsecurity.model.User;
import dev.wande.jpaauthsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaAuthSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaAuthSecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService userService, PasswordEncoder passwordEncoder) {
		return args -> {

			userService.saveUser(new User(
					"wande",
					"Wanderson Felipe",
					passwordEncoder.encode("password"),
					"wanderson@mail.com",
					new ArrayList<>() {
						{
							add("ROLE_USER");
							add("ROLE_ADMIN");
						}
					}
			));

			userService.saveUser(new User(
					"wade",
					"Wanderson",
					passwordEncoder.encode("pass"),
					"wade@mail.com",
					new ArrayList<>() {
						{
							add("ROLE_USER");
						}
					}
			));

		};
	}

}
