package com.test.c2;

import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/webapi")
public class AppConf extends Application {

	@Inject
	private C2Bean c2Bean;

	@Override
	public Set<Class<?>> getClasses() {
		c2Bean.doSomething1();
		final Set<Class<?>> classes = new HashSet<>();
		// register root resource
		classes.add(TestService.class);
		return classes;
	}
}