package edu.lemonschool.practicework14;

public abstract class HomeGadgets extends Machinery{
    private String type;
    private final Virus virus;
    public HomeGadgets(String number, String screen, String OS, String type, Virus virus) {
        super(number, screen, OS);
        this.type = type;
        this.virus = virus;
    }

    protected Virus getVirus() {
        return virus;
    }
}
