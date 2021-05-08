package com.prominent.json.ProminentJsonUtilities.entity;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Log
public class EntityTest {
    public static void main (String agrs[]) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("D:\\prominent\\employee.txt"));
        ObjectMapper mapper =new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Root value = mapper.readValue(jsonData, Root.class);
        log.info(" Student info "+value.toString());
    }
}
