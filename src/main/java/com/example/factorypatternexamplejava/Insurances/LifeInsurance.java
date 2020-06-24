package com.example.factorypatternexamplejava.Insurances;

public class LifeInsurance implements Insurance{

    public static String id = "VCFSVA";

    @Override
    public String getDescription() {
        return "Hola soy un seguro de Vida";
    }

    @Override
    public String getId() {
        return id;
    }
 

}
