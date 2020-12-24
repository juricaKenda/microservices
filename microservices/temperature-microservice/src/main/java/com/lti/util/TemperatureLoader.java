package com.lti.util;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import lombok.Data;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@UtilityClass
@Slf4j
public class TemperatureLoader {
    private final String PATH = "./measurements.csv";

    private List<String> temperatures;

    static {
        List<Measurement> measurements;
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            CsvToBean<Measurement> csvReader = new CsvToBeanBuilder<Measurement>(reader)
                    .withType(Measurement.class)
                    .withSeparator(',')
                    .withIgnoreLeadingWhiteSpace(true)
                    .withIgnoreEmptyLine(true)
                    .withMappingStrategy(makeMappingStrategy())
                    .build();
            measurements = csvReader.parse();
            temperatures = measurements.stream()
                    .map(Measurement::getTemperature)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            log.warn("Something went wrong while parsing measurements.csv", e);
        }
    }

    public List<String> getTemperatures() {
        return temperatures;
    }

    private HeaderColumnNameTranslateMappingStrategy<Measurement> makeMappingStrategy() {
        Map<String, String> columnMappings = new HashMap<>();
        columnMappings.put("Temperature", "temperature");

        HeaderColumnNameTranslateMappingStrategy<Measurement> mappingStrategy =
                new HeaderColumnNameTranslateMappingStrategy<>();
        mappingStrategy.setColumnMapping(columnMappings);
        mappingStrategy.setType(Measurement.class);

        return mappingStrategy;
    }

    @Data
    private static class Measurement {
        private String temperature;
    }
}
