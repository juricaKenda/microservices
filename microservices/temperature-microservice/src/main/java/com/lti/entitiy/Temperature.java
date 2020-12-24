package com.lti.entitiy;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Temperature {

    @Id
    @GeneratedValue
    private Integer id;
    private String temperature;
}
