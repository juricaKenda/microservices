package com.lti.humiditymicroservice;

import com.lti.humiditymicroservice.entity.Humidity;
import com.lti.humiditymicroservice.repository.HumidityRepository;
import com.lti.humiditymicroservice.util.HumidityLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class HumidityMicroserviceApplication {

	private HumidityRepository repository;

	public HumidityMicroserviceApplication(HumidityRepository repository) {
		this.repository = repository;
		HumidityLoader loader = new HumidityLoader();
		loader.load();
		List<Humidity> humidity = loader.getHumidity().stream()
				.map(Humidity::new)
				.collect(Collectors.toList());
		humidity.forEach(repository::save);
	}

	public static void main(String[] args) {
		SpringApplication.run(HumidityMicroserviceApplication.class, args);
	}

}
