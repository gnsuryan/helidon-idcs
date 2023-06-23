package io.helidon.example.idcs;

import io.helidon.security.SecurityContext;
import io.helidon.security.annotations.Authenticated;
import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.net.URI;


@Path("/helidon")
@ApplicationScoped
@Authenticated(true)
public class HelidonResource {

    @Inject
    @ConfigProperty(name = "helidon.version")
    private String helidonVersion;


    @Inject
    @ConfigProperty(name = "wls.service.url")
    private URI wlsServiceUri;

    @Inject
    private JsonWebToken jwt;

    @Authenticated(false)
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getDefaultMessage() {
        return Json.createObjectBuilder()
                .add("message", "helidon "+helidonVersion+" service")
                .build();
    }

    @Authenticated(true)
    @Path("/auth")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject authWLS() {
        try
        {
            var bearerToken = jwt.getRawToken(); // Manually access raw bearer token
            System.out.println("BearerToken: "+bearerToken);
            return Json.createObjectBuilder()
                    .add("token", bearerToken)
                    .build();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            String stacktrace = ExceptionUtils.getStackTrace(e);
            return Json.createObjectBuilder()
                    .add("token", stacktrace)
                    .build();
        }
    }

}
