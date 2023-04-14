package edu.lemonschool.practicework14;

final class Smartphone extends HomeGadgets{

    public Smartphone(String number, String screen, String OS, String type, Virus virus) {
        super(number, screen, OS, type, virus);
    }


    @Override
    public String signal() {
        return "It's Android";
    }
    public String ring(){
        return "ring, ring";
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "virus= '" + getVirus() + '\'' +
                ", call= '" + ring() + '\'' +
                ", number='" + number + '\'' +
                ", screen='" + screen + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}
