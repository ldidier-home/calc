package com.example.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.example.calc.service.CalcService;
import com.example.dto.ResultDTO;

/**
 * Root resource (exposed at "calc" path)
 */
@Path("operation")
public class CalcResource {
	
	@Inject
	private CalcService calcService;
    
    @GET
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(@QueryParam("a")float a, @QueryParam("b")float b) {
        return Response.status(Status.OK).entity(new ResultDTO(this.calcService.add(a, b))).build();
    }
    
    @GET
    @Path("subtract")
    @Produces(MediaType.APPLICATION_JSON)
    public Response subtract(@QueryParam("a")float a, @QueryParam("b")float b) {
        return Response.status(Status.OK).entity(new ResultDTO(this.calcService.subtract(a, b))).build();
    }
    
    @GET
    @Path("multiply")
    @Produces(MediaType.APPLICATION_JSON)
    public Response multiply(@QueryParam("a")float a, @QueryParam("b")float b) {
        return Response.status(Status.OK).entity(new ResultDTO(this.calcService.multiply(a, b))).build();
    }
    
    @GET
    @Path("divide")
    @Produces(MediaType.APPLICATION_JSON)
    public Response divide(@QueryParam("a")float a, @QueryParam("b")float b) {
        return Response.status(Status.OK).entity(new ResultDTO(this.calcService.divide(a, b))).build();
    }
}
