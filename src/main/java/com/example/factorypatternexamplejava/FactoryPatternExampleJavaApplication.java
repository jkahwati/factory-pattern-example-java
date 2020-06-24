package com.example.factorypatternexamplejava;

import com.example.factorypatternexamplejava.Insurances.Insurance;
import com.example.factorypatternexamplejava.Insurances.InsuranceFactory;
import com.example.factorypatternexamplejava.Insurances.InsuranceFactoryImpl;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryPatternExampleJavaApplication {

	public static void main(String[] args) {

		InsuranceFactory insuranceFactory = new InsuranceFactoryImpl();
		Insurance lifeInsurance = insuranceFactory.create("AUTO_INSURANCE");
		Insurance autoInsuranceAuto = insuranceFactory.create("LIFE_INSURANCE");
		System.out.println(lifeInsurance.getId() + " - " + lifeInsurance.getDescription());
		System.out.println(autoInsuranceAuto.getId() + " - " + autoInsuranceAuto.getDescription());

	}

}
