package com.balltheft;
 
/**
 * @author Crunchify
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
 
@Path("/testparams")
public class TestParams {
 
      @Path("{inputNumber}")
      @GET
      @Produces("application/json")
      public Response convertFtoCfromInput(@PathParam("inputNumber") float f) throws JSONException {
 
        JSONObject jsonObject = new JSONObject();
        float celsius;
        celsius = f;
        jsonObject.put("mujParam", celsius);
 
        String result = jsonObject.toString();
        return Response.status(200).entity(result).build();
      }
      
}