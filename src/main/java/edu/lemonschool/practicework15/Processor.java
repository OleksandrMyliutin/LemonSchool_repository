package edu.lemonschool.practicework15;

public class Processor extends Hardware{
    public Processor(String name, String model, String description, Producer producer) {
        super(name, model, description, producer);
    }
    public void processWork(String Info){
        System.out.println(Info);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", producer=" + producer +
                '}';
    }
}
