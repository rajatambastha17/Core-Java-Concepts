package com.javaconcepts.functionalinterfaces;

public class FunctionalInterfaceImp implements FunctionalInterface{

    public static void main(String[] args) {
        FunctionalInterface fi = new FunctionalInterfaceImp();
        System.out.println(fi.sports());

        FunctionalInterface fiLambda = () -> "From lambda: Basketball";

        System.out.println(fiLambda.sports());
    }

    @Override
    public String sports() {
        return "Cricket";
    }
}
