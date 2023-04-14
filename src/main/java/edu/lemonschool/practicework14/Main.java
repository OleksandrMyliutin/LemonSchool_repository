package edu.lemonschool.practicework14;

public class Main {
    public static void main(String[] args){
        Virus trojan = new Trojan("trojan");
        PersonalComputer pc = new PersonalComputer( "HQ513", "Screen 1980*1080px", "Windows OS", "PC", trojan);
        System.out.println(pc);
        Virus stuxnet = new Stuxnet();
        Smartphone phone = new Smartphone("Realme_GT_5G", "Screen 1980*1080px", "Android", "phone", stuxnet);
        System.out.println(phone);
    }

}

