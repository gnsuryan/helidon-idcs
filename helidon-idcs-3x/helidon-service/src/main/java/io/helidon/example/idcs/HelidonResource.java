package io.helidon.example.idcs;

import io.helidon.security.SecurityContext;
import io.helidon.security.annotations.Authenticated;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
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

    @Authenticated(false)
	@Path("/noauth")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject noAuth() throws Exception {
    	return Json.createObjectBuilder().add("message","helidon "+helidonVersion+": No Auth Message").build();
    }

    @Authenticated(true)
	@Path("/auth")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject auth() throws Exception {
    	return Json.createObjectBuilder().add("message","helidon "+helidonVersion+": Auth Message").build();
    }


    @Authenticated(true)
    @Path("/auth/wls")
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
			String stacktrace = ExceptionUtils.getStackTrace(e);
			return Json.createObjectBuilder()
					.add("token", stacktrace)
					.build();
        }
    }

    @Authenticated(false)
	@Path("/loggedout")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject userLogout() throws Exception {
    	return Json.createObjectBuilder().add("message","helidon "+helidonVersion+": loggedout successfully").build();
    }
}