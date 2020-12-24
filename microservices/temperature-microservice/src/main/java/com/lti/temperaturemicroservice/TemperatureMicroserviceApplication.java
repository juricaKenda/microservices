package com.lti.temperaturemicroservice;

import com.lti.entitiy.Temperature;
import com.lti.repository.TemperatureRepository;
import com.lti.util.TemperatureLoader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class TemperatureMicroserviceApplication implements CommandLineRunner {

	private final TemperatureRepository repository;

	public TemperatureMicroserviceApplication(TemperatureRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TemperatureMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) {
		List<Temperature> temperatures = TemperatureLoader.getTemperatures().stream()
				.map(Temperature::new)
				.collect(Collectors.toList());

		temperatures.forEach(repository::save);
	}
}
