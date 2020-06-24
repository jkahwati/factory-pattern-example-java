package com.example.factorypatternexamplejava.Insurances;

//Interface
public interface InsuranceFactory {
    Insurance create(String type);

}