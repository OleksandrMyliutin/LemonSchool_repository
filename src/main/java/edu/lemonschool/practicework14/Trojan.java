package edu.lemonschool.practicework14;

public class Trojan implements Virus, Cloneable{
    private  String type;

    public Trojan(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Virus clone(){
        try {
            return(Virus) super.clone();
        } catch (CloneNotSupportedException e){
            throw new  AssertionError();
        }
    }
    @Override
    public String Intrude() {
        return "Krovosisya in your system";
    }

    @Override
    public String toString() {
        return "Trojan type " + type;
    }
}
