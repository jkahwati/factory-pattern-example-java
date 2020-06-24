package com.example.factorypatternexamplejava.Insurances;

public class AutoInsurance implements Insurance{

    public static String id = "ACBF02";
    private String dynamics;

    public AutoInsurance(String dynamics) {
        this.dynamics = dynamics;
    }

    @Override
    public String getDynamics() {
        return this.dynamics;
    }

    public void setDynamics(String dynamics) {
        this.dynamics = dynamics;
    }

    @Override
    public String getDescription() {
        return "Hola soy un seguro de Auto: " +  id;
    }

    @Override
    public String getId() {
        return id;
    }
    
    
    
}
