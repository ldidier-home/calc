package com.example.calc.service.impl;

import org.jvnet.hk2.annotations.Service;

import com.example.calc.service.CalcService;

@Service
public class CalcServiceImpl implements CalcService {

	public float add(float a, float b) {
		return a+b;
	}

	public float subtract(float a, float b) {
		return a-b;
	}

	public float multiply(float a, float b) {
		return a*b;
	}

	public float divide(float a, float b) {
		return a/b;
	}

}
