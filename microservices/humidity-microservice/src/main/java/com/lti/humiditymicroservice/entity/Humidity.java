package com.lti.humiditymicroservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Humidity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer humidity;

    public Humidity() {
    }

    public Humidity(Integer id) {
        this.id = id;
    }
}
