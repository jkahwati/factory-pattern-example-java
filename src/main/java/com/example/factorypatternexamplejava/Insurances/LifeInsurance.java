package com.example.factorypatternexamplejava.Insurances;

public class LifeInsurance implements Insurance{

    public static String id = "VCFSVA";
    private String dynamics;

    public LifeInsurance(String dynamics) {
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
        return "Hola soy un seguro de Vida: " + id;
    }

    @Override
    public String getId() {
        return id;
    }
 

}
