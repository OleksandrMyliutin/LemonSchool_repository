package edu.lemonschool.practicework15;

public class Scanner extends Hardware{
    public Scanner(String name, String model, String description, Producer producer) {
        super(name, model, description, producer);
    }
    @Override
    public String toString() {
        return "Scanner{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", producer=" + producer +
                '}';
    }
}
