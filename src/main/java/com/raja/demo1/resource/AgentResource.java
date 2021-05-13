package com.raja.demo1.resource;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.raja.demo1.DataType.Agent;
import com.raja.demo1.utils.JsonUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/testPath")
public class AgentResource {

    @GET
    @Path("/agent")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAppName() throws JsonProcessingException {
        Agent agent = new Agent("raja", "hajipur", 21);
        return JsonUtils.getJson(agent);
    }
}
