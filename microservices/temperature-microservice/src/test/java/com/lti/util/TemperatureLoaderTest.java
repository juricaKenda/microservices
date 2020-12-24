package com.lti.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureLoaderTest {

    @Test
    public void getTemperaturesTest() {
        List<Integer> temperatures = TemperatureLoader.getTemperatures();
        assertTrue(temperatures.size() > 0);
    }

}