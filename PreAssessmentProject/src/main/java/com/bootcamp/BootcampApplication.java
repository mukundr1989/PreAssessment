package com.bootcamp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampApplication.class, args);
	}

	/*
	 * @GetMapping("/hello") public String hello(@RequestParam(value = "name",
	 * defaultValue = "World") String name) { return String.format("Hello %s!",
	 * name); }
	 */
}