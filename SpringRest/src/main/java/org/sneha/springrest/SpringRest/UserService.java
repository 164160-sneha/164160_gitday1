package org.sneha.springrest.SpringRest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String Check(@FormParam("userName") String userName, @FormParam("password") String password) {

		if (userName.equals("sneha") && password.equals("java")) {
			return "valid user";
		} else
			return "invalid user";

	}

}
