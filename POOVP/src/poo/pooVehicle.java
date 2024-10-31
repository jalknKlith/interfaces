package poo;

import classOnes.Vehicle;

public class pooVehicle {

    public static void main(String[] args) {
        //
        Vehicle objVehicle;
        objVehicle = new Vehicle();
        objVehicle.setPlate("335KQW");
        objVehicle.setBrand("Honda");
        objVehicle.setColor("Blue");
        objVehicle.setModel(2008);
        objVehicle.setChassis("CKHW8923P9YU23");
        objVehicle.setWeight(16000);
        objVehicle.setType("Sedan");
        objVehicle.setCapacity("8");

        System.out.println("\n"+"VEHICLE'S DATES");
        System.out.println("-------------------------------");
        System.out.println("Plate: " + objVehicle.getPlate());
        System.out.println("Color: " + objVehicle.getColor());
        System.out.println("Model: " + objVehicle.getModel());
        System.out.println("Chassis: " + objVehicle.getChassis());
        System.out.println("Capacity: " + objVehicle.getCapacity());
        System.out.println("Type: " + objVehicle.getType());
        System.out.println("Brand: " + objVehicle.getBrand());
        System.out.println("Weight: " + objVehicle.getWeight());
        objVehicle.validateTimeUsage(2024);
        objVehicle.validatePCM();
        System.out.println("The average per year is: "
                + objVehicle.validateKs(45000,
                2024)+"Kms");
        System.out.println("-------------------------------");
    }
}
