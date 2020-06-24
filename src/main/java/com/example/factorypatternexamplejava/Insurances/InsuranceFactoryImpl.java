package com.example.factorypatternexamplejava.Insurances;

public class InsuranceFactoryImpl implements InsuranceFactory {

    @Override
    public Insurance create(String type, String dynamics) {
        switch (type) {
            case "LIFE_INSURANCE":
                return new LifeInsurance( dynamics);
            case "AUTO_INSURANCE":
                return new AutoInsurance( dynamics);
            default:
                return null;
        }
    }

}
