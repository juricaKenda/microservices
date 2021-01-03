package com.lti.service;

import com.lti.repository.TemperatureRepository;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    private final TemperatureRepository temperatureRepository;

    public TemperatureService(TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    public Integer fetchTemperature() {
        int id = generateId();
        return temperatureRepository.getById(id).getTemperature();
    }

    private int generateId() {
        //TODO implement formula
        return 1;
    }
}
