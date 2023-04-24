package edu.lemonschool.practicework15;

public class VideoCard extends Hardware{
    public VideoCard(String name, String model, String description, Producer producer) {
        super(name, model, description, producer);
    }
    public void videoCard(String fps){
        System.out.println(fps);
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", producer=" + producer +
                '}';
    }
}
