package com.example.project.config;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.example.project.resources.ProjectResource;
import com.example.project.service.ProjectService;
import com.example.project.service.impl.ProjectServiceImpl;

@ApplicationPath("/api")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		register(ProjectResource.class);
		register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(ProjectServiceImpl.class).to(ProjectService.class).in(Singleton.class);
            }
        });
	}

	

}
