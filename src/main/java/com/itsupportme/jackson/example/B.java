package com.itsupportme.jackson.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class B {

    private final String property2;

    @JsonCreator
    public B(@JsonProperty("property2") String property2) {
        this.property2 = property2;
    }

    public String getProperty2() {
        return property2;
    }

    @Override
    public String toString() {
        return "B{" +
                "property2='" + property2 + '\'' +
                '}';
    }
}
