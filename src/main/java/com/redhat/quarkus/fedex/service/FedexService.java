
package com.redhat.quarkus.fedex.service;

import java.time.LocalDate;
import java.util.UUID;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.redhat.quarkus.fedex.domain.Label;
import com.redhat.quarkus.fedex.domain.Order;

@Path("/fedex")
public class FedexService {

  @ConfigProperty(name="label.delay", defaultValue = "50")
  long delay;

  @POST
  @Path("/createlabel")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Label createLabel(Order order) throws InterruptedException {
    UUID randomUUID = UUID.randomUUID();
    System.out.println("Label generated -> "+randomUUID.toString());
    Thread.sleep(delay);
    return new Label(randomUUID.toString(), LocalDate.now());
  }

}