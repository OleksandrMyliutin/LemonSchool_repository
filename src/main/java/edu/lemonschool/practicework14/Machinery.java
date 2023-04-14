package edu.lemonschool.practicework14;

public abstract class  Machinery {
    protected String number;
    protected String screen;
    protected String OS;

    public Machinery(String number, String screen, String OS) {
        this.number = number;
        this.screen = screen;
        this.OS = OS;
    }

    public Machinery() {
    }
    public abstract String signal();

}
