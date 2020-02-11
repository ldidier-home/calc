package com.example.calc.service;

import javax.inject.Singleton;

import org.jvnet.hk2.annotations.Contract;

@Singleton
@Contract
public interface CalcService {
	
	float add(float a,float b);
	
	float subtract(float a,float b);

	float multiply(float a,float b);
	
	float divide(float a,float b);
}
