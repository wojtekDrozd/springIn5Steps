package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCdiDao.getData();
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;

	}

}
