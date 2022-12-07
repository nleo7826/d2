package main;

import java.util.Date;

import models.Car;
import models.TurboChargedCar;

public class Main {
    
    public static void main(String[] args) {
    
        Car myCar = new Car("sdljkdsf");
        Car myOtherCar = new TurboChargedCar("T123124");
        Date date = new Date();
        java.sql.Date day = new java.sql.Date(123L);

        myCar.setColor("red");
        myCar.setMake("Honda");
        myCar.setRegistration("S12");
        myCar.setRegistrationDate(date);

        myCar.horn();
        System.out.printf("color: %s, make: %s, registration: %s\n", myCar.getColor(), myCar.getMake(), myCar.getRegistration());

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        System.out.printf("accelerate: %s\n", myCar.getAcceleration());

        if (myOtherCar instanceof TurboChargedCar) {
            //Cast into a TurboChargedCar type
            TurboChargedCar turbo = (TurboChargedCar)myOtherCar;
            turbo.setTurbo(true);
        }
    }
}
