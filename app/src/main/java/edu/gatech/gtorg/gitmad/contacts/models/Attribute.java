package edu.gatech.gtorg.gitmad.contacts.models;

import java.io.Serializable;

public class Attribute implements Serializable {
    String key;
    String value;

    public Attribute() {

    }

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ": " + value;
    }
}
