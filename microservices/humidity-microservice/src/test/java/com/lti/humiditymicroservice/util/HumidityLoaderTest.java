package com.lti.humiditymicroservice.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HumidityLoaderTest {

    @Test
    public void loadTest() {
        HumidityLoader loader = new HumidityLoader();
        loader.load();
        List<Integer> humidity = loader.getHumidities();
        assertNotNull(humidity);
        assertTrue(humidity.size() > 0);
        humidity.forEach(Assertions::assertNotNull);
    }
}
