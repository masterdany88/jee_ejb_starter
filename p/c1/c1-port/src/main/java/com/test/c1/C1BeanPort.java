package com.test.c1;

import javax.ejb.Remote;


@Remote
public interface C1BeanPort {
	void doSomething();
}