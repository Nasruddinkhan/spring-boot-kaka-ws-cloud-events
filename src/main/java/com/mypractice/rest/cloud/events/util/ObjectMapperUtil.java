package com.mypractice.rest.cloud.events.util;


import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;

import java.util.Objects;

@UtilityClass
public class ObjectMapperUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Object convertObject(Object inputObject, String outputClass) throws ClassNotFoundException {
        return Objects.nonNull(outputClass) ? objectMapper.convertValue(inputObject, Class.forName(outputClass))
                : inputObject;
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}

