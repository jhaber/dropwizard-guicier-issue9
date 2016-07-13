package com.hubspot.dropwizard.issue9;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.fasterxml.jackson.annotation.JsonProperty;

@Path("/health/status")
@Produces(MediaType.APPLICATION_JSON)
public class HealthResource {

  private class HealthResponse {
    @JsonProperty
    private String status;

    public HealthResponse() {
    }

    public HealthResponse(String status) {
      this.status = status;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }
  }

  @Inject
  public HealthResource() {

  }

  @GET
  @Timed
  public HealthResponse processImage() {
    return new HealthResponse("OK");
  }
}
