package pl.btbw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class MyCtrl {

    @GET
    @Path("uppercase/{message: [A-Z]*}")
    public String uppercase(@PathParam("message") String message) {
        System.out.println("message: " + message);
        return message;
    }

    @GET
    @Path("lowercase/{message: [a-z]*}")
    public String lowercase(@PathParam("message") String message) {
        System.out.println("message: " + message);
        return message;
    }

    @GET
    @Path("uppercaseThenLowercase/{message: [A-Z]*[a-z]*}")
    public String uppercaseThenLowercase(@PathParam("message") String message) {
        System.out.println("message: " + message);
        return message;
    }
}
