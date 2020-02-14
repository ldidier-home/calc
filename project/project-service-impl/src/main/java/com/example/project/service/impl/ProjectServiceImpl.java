package com.example.project.service.impl;

import org.jvnet.hk2.annotations.Service;

import com.example.project.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Override
	public String helloFromProject() {
		return "Hello from Project";
	}


}
