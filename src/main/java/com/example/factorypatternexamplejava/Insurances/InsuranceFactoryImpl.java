package com.example.factorypatternexamplejava.Insurances;

public class InsuranceFactoryImpl implements InsuranceFactory {

    @Override
    public Insurance create(String type) {
        switch (type) {
            case "LIFE_INSURANCE":
                return new LifeInsurance();
            case "AUTO_INSURANCE":
                return new AutoInsurance();
            default:
                return null;
        }
    }

}
