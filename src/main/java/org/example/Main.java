package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Meine Autos");

        Car myFirstCar = new Car("Opel", 220.20, 2022, 7);
        Car mySecondCar = new Car("Mazda", 250, 2015, 2);
        Car myThirdCar = new Car("Mercedes", 300, 2022, 4);
        Car myFourthCar = new Car("Yugo", 100, 1959, 4);

        List<Car> myCars = new ArrayList<>();
        myCars.add(myFirstCar);
        myCars.add(mySecondCar);
        myCars.add(myThirdCar);
        myCars.add(myFourthCar);

        System.out.println("Meine Autos" +  myCars);

        List<Car> otherCars = new ArrayList<>();
        otherCars.add(new Car("Opel",120.0,2015,5));
        otherCars.add(new Car("Tesla",300.0,2020,5));
        otherCars.add(new Car("Skoda",200.0,2018,5));
        otherCars.add(new Car("Porsche",350.0,2022,2));


        System.out.println("Andere Autos" + otherCars);
    }
}
