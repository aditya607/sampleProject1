package com.raja.demo1.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {
    private static ObjectMapper om = new ObjectMapper();
    public static String getJson(Object t) throws JsonProcessingException {
        return om.writeValueAsString(t);
    }
}
