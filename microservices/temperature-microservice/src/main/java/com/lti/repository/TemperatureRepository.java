package com.lti.repository;

import com.lti.entitiy.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureRepository extends JpaRepository<Temperature, Integer> {
    Temperature getById(Integer id);
}
