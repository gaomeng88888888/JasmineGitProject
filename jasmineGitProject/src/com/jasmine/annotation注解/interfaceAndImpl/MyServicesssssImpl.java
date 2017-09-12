package com.jasmine.annotation注解.interfaceAndImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServicesssssImpl implements MyServicesssss{

	@Autowired
	private MyInterfacexxxxxxxx myInterfacexxxxxxxx;
	
	public String sss() {
		return myInterfacexxxxxxxx.show();
	}
}