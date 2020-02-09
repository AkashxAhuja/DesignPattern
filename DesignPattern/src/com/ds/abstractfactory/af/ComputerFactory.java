package com.ds.abstractfactory.af;

import com.ds.abstractfactory.model.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}

}
