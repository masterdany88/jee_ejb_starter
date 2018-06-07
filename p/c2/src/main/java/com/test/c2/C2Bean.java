package com.test.c2;

import com.test.c1.C1BeanPort;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;


@Local
@Stateless
public class C2Bean {

	@Inject
	private C1BeanPort c1Bean;

	public void doSomething1() {
		c1Bean.doSomething();
	}
	public void doSomething() {
		System.out.println("c2Bean do something");
	}
}
