package com.lti.util;

import lombok.Data;

@Data
public class Measurement {
    private int temperature;
    private int pressure;
    private int humidity;
    private int co;
    private int no2;
    private int so2;
}
