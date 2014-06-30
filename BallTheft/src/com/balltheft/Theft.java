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
public class Theft {
 
      @Path("{inputNumber}")
      @GET
      @Produces("application/json")
      public Response stealBall(@PathParam("myID") long myID, @PathParam("targetID") long ttID) throws JSONException {
 
        JSONObject jsonObject = new JSONObject();
        float celsius;
        celsius = ttID;
        jsonObject.put("mujParam", celsius);
 
        String result = jsonObject.toString();
        return Response.status(200).entity(result).build();
      }
      
}