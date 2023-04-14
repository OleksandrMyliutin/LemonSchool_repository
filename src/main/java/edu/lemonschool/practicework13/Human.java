package edu.lemonschool.practicework13;

import lombok.Builder;

import java.util.Arrays;
@Builder
public class Human{
    private String firstName;
    private String secondName;
    private String thirdName;
    private int age;
    private int[] date;
    private String identifier;

    public Human() {
        this.firstName = "test";
        this.secondName = "test";
        this.thirdName = "test";
        this.age = 18;
        this.date = new int[]{10, 4, 2005};
        this.identifier = "id12345";
    }

    public Human(String firstName, String secondName, String thirdName, int age, int[] date, String identifier) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.age = age;
        this.date = date;
        this.identifier = identifier;
    }
@Override
    public String toString() {
        String var10000 = this.firstName;
        return "Human:firstName='" + var10000 + "', " +
                "secondName='" + this.secondName + "', " +
                "thirdName='" + this.thirdName + "', " +
                "age=" + this.age + ", " +
                "date=" + Arrays.toString(this.date) + ", " +
                "identifier='" + this.identifier + "'";
    }

    public int[] varargs(int... el) {
        int counter = 0;
        int[] k = new int[el.length];

        for(int i = 0; i < el.length; ++i) {
            k[counter] = el[i];
            ++counter;
        }

        return Arrays.copyOf(k, counter);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String getThirdName() {
        return this.thirdName;
    }

    public int getAge() {
        return this.age;
    }

    public int[] getDate() {
        return this.date;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate(int[] date) {
        this.date = date;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

}
