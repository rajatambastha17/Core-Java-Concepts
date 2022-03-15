package com.javaconcepts.lambda;

public class VehicleImpl implements Vehicle{
    public static void main(String[] args) {
//        Vehicle v = (type, purpose) -> "Type of vehicle is "+type+" and it is used for "+purpose;
        Vehicle v = new VehicleImpl();
        Vehicle vh = (type, purpose) -> "[Implementing by lambda]--Type of vehicle is "+type+" and it is used for "+purpose;
        System.out.println(v.type("Truck", "Transportation"));
        System.out.println(vh.type("Car", "Travelling"));
    }

    @Override
    public String type(String type, String purpose) {
        return "[Implementing by class]--Type of vehicle is "+type+" and it is used for "+purpose;
    }
}
