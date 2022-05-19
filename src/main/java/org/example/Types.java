package org.example;

public enum Types {
    ONLINE("Online"),
    INPERSON("InPerson");

    private final String name;

    private Types(String constant) {
        this.name = constant;
    }
}
