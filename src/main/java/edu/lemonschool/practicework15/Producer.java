package edu.lemonschool.practicework15;

public class Producer implements Cloneable{

    private String address;
    private String email;
    private String phoneNumber;

    public Producer(String address, String email, String phoneNumber) {
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Producer clone(){
        try {
            return(Producer) super.clone();
        } catch (CloneNotSupportedException e){
            throw new  AssertionError();
        }
    }

    @Override
    public String toString() {
        return "{" +
                "address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
