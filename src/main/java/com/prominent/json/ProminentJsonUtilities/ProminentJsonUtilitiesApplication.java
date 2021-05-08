package com.prominent.json.ProminentJsonUtilities;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.prominent.json.ProminentJsonUtilities.entity.Root;
import com.prominent.json.ProminentJsonUtilities.repo.RootJpaRepo;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


@SpringBootApplication
@Log
@EnableJpaRepositories
public class ProminentJsonUtilitiesApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(ProminentJsonUtilitiesApplication.class, args);
	}

	@Component
	class DemoCommandLineRunner implements CommandLineRunner {

		@Autowired
		private RootJpaRepo rootJpaRepo;

		@Override
		public void run(String... args) throws Exception {

			byte[] jsonData = Files.readAllBytes(Paths.get("D:\\prominent\\employee.txt"));
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			Root root = mapper.readValue(jsonData, Root.class);
			Root UpdatedRoot = rootJpaRepo.save(root);
			log.info("JSON inserted successfully");
		}
	}
}
