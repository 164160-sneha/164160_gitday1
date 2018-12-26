package org.sneha.springrest.SpringRest;
import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sneha.pojo.SpringRest.Zipcode;

import com.spring.dao.UserDao;

@Path("/zipcode")
public class Details {
	UserDao dao=new UserDao();
	
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String showInfo(@FormParam("zipcode") long zipcode) {

		for (Map.Entry<Long, Zipcode> entry : dao.getAllMessages().entrySet()) {

			if (zipcode == entry.getKey()) {
				Zipcode Zipcode = entry.getValue();
				return "Value is " + Zipcode;
			}

		}
		return "Enter Valid zipcode";
	}
}
