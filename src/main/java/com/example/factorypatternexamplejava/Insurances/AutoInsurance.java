package com.example.factorypatternexamplejava.Insurances;

public class AutoInsurance implements Insurance{

    public static String id = "ACBF02";

    @Override
    public String getDescription() {
        return "Hola soy un seguro de Auto";
    }

    @Override
    public String getId() {
        return id;
    }
    
    
}
