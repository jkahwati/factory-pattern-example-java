package com.example.factorypatternexamplejava;

import com.example.factorypatternexamplejava.Insurances.Insurance;
import com.example.factorypatternexamplejava.Insurances.InsuranceFactory;
import com.example.factorypatternexamplejava.Insurances.InsuranceFactoryImpl;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternExampleJavaApplication {

	public static void main(String[] args) {

		InsuranceFactory insuranceFactory = new InsuranceFactoryImpl();
		Insurance insurance = insuranceFactory.create("AUTO_INSURANCE");
		Insurance insuranceAuto = insuranceFactory.create("LIFE_INSURANCE");
		System.out.println(insurance.getDescription());
		System.out.println(insuranceAuto.getDescription());

	}

}
