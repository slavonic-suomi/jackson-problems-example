package com.itsupportme.jackson.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class A {

    private final String property1;
    private final B b;

    @JsonCreator
    public A(@JsonProperty("property1") String property1, @JsonUnwrapped B b) {
        this.property1 = property1;
        this.b = b;
    }

    public String getProperty1() {
        return property1;
    }

    @JsonUnwrapped
    public B getB() {
        return b;
    }

    @Override
    public String toString() {
        return "A{" +
                "property1='" + property1 + '\'' +
                ", b=" + b +
                '}';
    }
}
