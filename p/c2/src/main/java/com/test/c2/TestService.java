package com.test.c2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("TestService")
public class TestService {
	@GET
	@Path("all")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<String> getAllStrings() {
		List list = new ArrayList<String>();
		list.add("SS");
		//return List.of("l1","l2","l3");
		return list;
	}
}
