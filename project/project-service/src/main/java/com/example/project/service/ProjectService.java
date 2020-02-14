package com.example.project.service;

import javax.inject.Singleton;

import org.jvnet.hk2.annotations.Contract;

@Singleton
@Contract
public interface ProjectService {
	
	String helloFromProject();

}
