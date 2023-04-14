package edu.lemonschool.practicework14;

final class PersonalComputer extends HomeGadgets{

    public PersonalComputer(String number, String screen, String OS, String type, Virus virus) {
        super(number, screen, OS, type, virus);
    }



    @Override
    public String signal() {
        return "0110101001";
    }

    public void playgames(){

    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "virus= " + getVirus()+
                ", number='" + number + '\'' +
                ", screen='" + screen + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}
