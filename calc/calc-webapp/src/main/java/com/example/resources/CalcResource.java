package com.example.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

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
    public ResultDTO add(@QueryParam("a")float a, @QueryParam("b")float b) {
        return new ResultDTO(this.calcService.add(a, b));
    }
    
    @GET
    @Path("substract")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO substract(@QueryParam("a")float a, @QueryParam("b")float b) {
        return new ResultDTO(this.calcService.add(a, b));
    }
    
    @GET
    @Path("multiply")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO multiply(@QueryParam("a")float a, @QueryParam("b")float b) {
        return new ResultDTO(this.calcService.add(a, b));
    }
    
    @GET
    @Path("divide")
    @Produces(MediaType.APPLICATION_JSON)
    public ResultDTO divide(@QueryParam("a")float a, @QueryParam("b")float b) {
        return new ResultDTO(this.calcService.add(a, b));
    }
}
