package com.test.c1;

import javax.ejb.Stateless;


@Stateless
public class C1BeanAdapter implements C1BeanPort {

	public void doSomething() {
		System.out.println("C1BeanAdapter doing something");
	}
}
