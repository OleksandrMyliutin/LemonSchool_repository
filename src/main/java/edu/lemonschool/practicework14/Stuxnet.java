package edu.lemonschool.practicework14;

public class Stuxnet implements Virus {
    @Override
    public String Intrude() {
        return "insect";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Stuxnet";
    }
}
