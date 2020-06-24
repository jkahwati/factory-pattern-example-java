package com.example.factorypatternexamplejava;

import com.example.factorypatternexamplejava.Insurances.Insurance;
import com.example.factorypatternexamplejava.Insurances.InsuranceFactory;
import com.example.factorypatternexamplejava.Insurances.InsuranceFactoryImpl;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternExampleJavaApplication {

	public static void main(String[] args) {

		InsuranceFactory insuranceFactory = new InsuranceFactoryImpl();
		Insurance lifeInsurance = insuranceFactory.create("AUTO_INSURANCE", "{model: ford}");
		Insurance autoInsurance = insuranceFactory.create("LIFE_INSURANCE" , "{age: 28}");
		System.out.println(lifeInsurance.getDescription() + " - " + lifeInsurance.getDynamics());
		System.out.println(autoInsurance.getDescription() + " - " + autoInsurance.getDynamics());

	}

}
