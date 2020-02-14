package com.example.project.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.example.project.dto.ExampleDTO;
import com.example.project.service.ProjectService;

/**
 * Root resource (exposed at "calc" path)
 */
@Path("project")
public class ProjectResource {
	
	@Inject
	private ProjectService projectService;
    
	// JAX-RS api example
	@GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        return Response.status(Status.OK).entity(new ExampleDTO(this.projectService.helloFromProject())).build();
    }
	
}
