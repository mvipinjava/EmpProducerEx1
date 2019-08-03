package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/emp")
public class EmployeeProducer {
@GET
@Path("/show")
public String show() {
	return"hello from producer";
}
}
