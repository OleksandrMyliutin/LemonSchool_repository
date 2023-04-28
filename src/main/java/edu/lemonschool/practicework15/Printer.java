package edu.lemonschool.practicework15;

public class Printer extends Hardware{
    public Printer(String name, String model, String description, Producer producer) {
        super(name, model, description, producer);
    }
    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", producer=" + producer +
                '}';
    }
}
