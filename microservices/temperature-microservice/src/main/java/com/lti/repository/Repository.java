package com.lti.repository;

import com.lti.entitiy.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Temperature, Integer> {


}
