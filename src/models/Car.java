package models;

import java.util.Date;

public class Car {

    //Properties - members
    private String color;
    private String make;
    private String registration;
    private Date registrationDate;
    private Integer acceleration = 0;

    
    public Car() {

    }
    
    public Car(String registration) {
        this.registration = registration;
    }

    //Access methods to our members
    //getMemberName(), setMemberName()
    //Ctrl+Shift+P -> Source Actions
    public String getColor() {
        return this.color;
    }

    public void setColor(String colour) {
        this.color = color;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {

        switch (make.toLowerCase()) {
            case "honda":
            case "mazda":
            case "toyota":
                this.make = make;
                break;
            
            default:
        }
    }

    public String getRegistration() {
        return this.registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    public void horn() {
        System.out.println("horn horn horn");
    }

    public void accelerate() { 
        if (this.acceleration < 200) {
            this.acceleration++;
        } 
    }

    public void acceleration(Integer acceleration) {
        for (Integer i = 0; i < acceleration; i++) {
            this.accelerate();
        }
    }
    
    public void decelerate() {
        if (this.acceleration > 0) {
            this.acceleration--;
        }
    }

    public Integer getAcceleration() {
        return acceleration;
    }

}