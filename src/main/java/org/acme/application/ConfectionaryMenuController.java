package org.acme.application;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import lombok.RequiredArgsConstructor;
import org.acme.application.request.AddToConfectionaryMenuRequest;
import org.acme.application.response.ConfectionaryMenuResponse;
import org.acme.domain.service.CakeService;
import org.acme.domain.service.CookieService;

@Path("/confectionary-menu")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
@RequiredArgsConstructor
public class ConfectionaryMenuController {

  private final CakeService cakeService;
  private final CookieService cookieService;

  @GET
  public Response getMenu() {
    return Response.ok(
        new ConfectionaryMenuResponse(
            cakeService.list(),
            cookieService.list())
    ).build();
  }

  @POST
  public Response addToMenu(AddToConfectionaryMenuRequest request) {
    switch (request.type()) {
      case CAKE -> cakeService.add(request.flavour(), request.size());
      case COOKIE -> cookieService.add(request.flavour(), request.size());
      default ->
          throw new IllegalArgumentException("Only cakes and cookies can be added to the menu!");
    }

    return Response.ok().build();
  }
}
