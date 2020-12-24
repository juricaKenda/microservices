package com.lti.entitiy;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Temperature {

    @Id
    @GeneratedValue
    private Integer id;
    private String temperature;
}
