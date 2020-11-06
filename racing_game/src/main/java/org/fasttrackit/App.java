package org.fasttrackit;

public class App 
{
    public static void main( String[] args )
    {
        //prima masina
        //prin car am creat un obiect caruia ii vom asigna valorile de tip name/maxspeed/etc.
       Car carReference = new Car();
        carReference.name = "Ferrari";
        carReference.maxSpeed = 300;
        carReference.fuelLevel = 60;
        carReference.mileage = 13.5;
        carReference.doorCount =4;
        carReference.totalTraveledDistance = 0;
        carReference.damaged = true;
        carReference.color = "Blue";

        System.out.println("Properties of " + carReference.name + " car");
        System.out.println("Max speed of car is: " + carReference.maxSpeed + " " + "kph");
        System.out.println("Fuel level in the car is: " + carReference.fuelLevel + " " + "liters");
        System.out.println("Mileage of the car is: " +carReference.mileage + " km");
        System.out.println("Total Travelled Distance: " +carReference.totalTraveledDistance + " " + "km");
        System.out.println("The car is Damaged: " +carReference.damaged);
        System.out.println("Number of doors: " +carReference.doorCount);
        System.out.println("Car colour is: " +carReference.color);
        //text intre cele doua
        System.out.println("Opponent on the other lane is:");
        //a doua masina
        Car carReference2 = new Car();
        carReference2.name = "Bmw";
        carReference2.color ="Alb";
        carReference2.fuelLevel = 70;
        carReference2.maxSpeed = 170;
        carReference2.totalTraveledDistance = 170.000;

        System.out.println("Numele cazanului este: " +carReference2.name);
        System.out.println("Max speed of the car: " + carReference2.maxSpeed + " " + "km ca nu vreau eu sa-i dau");
        System.out.println("Ai bagat de 50 lei in rezervor: " + carReference2.fuelLevel + " " + "litri boss ca mananca putin");
        System.out.println("Car mileage is: " + carReference2.totalTraveledDistance + " " +"km 100% originali boss");
        System.out.println("The car is damaged: " + carReference2.damaged);
        System.out.println("Number of doors this car have: " + carReference2.doorCount);
        System.out.println("Color of the car: " +carReference2.color);

        System.out.println("Initial car name: "  + carReference.name);
        carReference.name = "Audi";
        System.out.println("New brand name of first car: " + carReference.name);

        carReference2.color = "Roz";
        System.out.println("New color of second car is: " + carReference2.color);



    }
}
