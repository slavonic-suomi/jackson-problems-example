package com.itsupportme.jackson.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JacksonCreatorWithUnwrappedTest {

    private static final String JSON = "{\"property1\":\"value1\",\"property2\":\"value2\"}";
    private static final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void serializationTest() throws JsonProcessingException {
        A a = new A("value1", new B("value2"));

        String resultJson = mapper.writeValueAsString(a);

        assertEquals(JSON, resultJson);
    }

    @Test
    public void deserializationTest() throws IOException {
        A a = mapper.readValue(JSON, A.class);

        assertNotNull(a);
        assertNotNull(a.getB());

        assertEquals("value1", a.getProperty1());
        assertEquals("value2", a.getB().getProperty2());

    }
}
