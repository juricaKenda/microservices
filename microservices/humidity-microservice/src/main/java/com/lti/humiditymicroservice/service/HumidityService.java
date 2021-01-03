package com.lti.humiditymicroservice.service;

import com.lti.humiditymicroservice.repository.HumidityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class HumidityService {

    private final HumidityRepository repository;

    public HumidityService(HumidityRepository repository) {
        this.repository = repository;
    }

    public Integer getHumidity() {
        int id = generateId();
        return repository.findAll().get(id).getHumidity();
        //return repository.getById(id).getHumidity();
    }

    private int generateId() {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        return 4 * hour + minute / 15;
    }
}
