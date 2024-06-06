package com.project1.project_study.Core.Utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class ApiObjectMapper<T> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostConstruct
    private void onInt() {
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public T dtoToModel(Object dto, Class<T> model) {
        return objectMapper.convertValue(dto, model);
    }

}
