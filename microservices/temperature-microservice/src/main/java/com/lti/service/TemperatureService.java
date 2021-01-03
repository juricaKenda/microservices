package com.lti.service;

import com.lti.repository.TemperatureRepository;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

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
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        return 4 * hour + minute / 15;
    }
}
