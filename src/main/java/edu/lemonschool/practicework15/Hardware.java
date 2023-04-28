package edu.lemonschool.practicework15;

public abstract class Hardware {
    protected String name;
    protected String model;
    protected String description;
    protected final Producer producer;

    public Hardware(String name, String model, String description, Producer producer) {
        this.name = name;
        this.model = model;
        this.description = description;
        this.producer = producer;
    }
}

