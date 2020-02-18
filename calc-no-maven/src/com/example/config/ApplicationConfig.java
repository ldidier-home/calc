package com.example.config;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.example.calc.service.CalcService;
import com.example.calc.service.impl.CalcServiceImpl;
import com.example.resources.CalcResource;

@ApplicationPath("/api")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		register(CalcResource.class);
		register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(CalcServiceImpl.class).to(CalcService.class).in(Singleton.class);
            }
        });
	}

	

}
