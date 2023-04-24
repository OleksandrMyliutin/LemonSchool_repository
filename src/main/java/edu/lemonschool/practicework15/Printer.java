package edu.lemonschool.practicework15;

public class Printer extends Hardware{
    public Printer(String name, String model, String description, Producer producer) {
        super(name, model, description, producer);
    }

    public void print(String page){
        System.out.println(page);
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
