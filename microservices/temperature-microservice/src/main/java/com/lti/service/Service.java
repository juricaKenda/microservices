package com.lti.service;

import com.lti.entitiy.Temperature;
import com.lti.repository.Repository;

@org.springframework.stereotype.Service
public class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String fetchTemperature() {
        int id = generateId();
        return repository.getById(id).getTemperature();
    }

    private int generateId() {
        //TODO implement formula
        return 0;
    }
}
