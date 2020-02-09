package com.ds.abstractfactory;

import com.ds.abstractfactory.model.Computer;
import com.ds.abstractfactory.af.*;

public class ComputerClient {
	public static void main(String[] args) {
		client();
	}

	private static void client() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		System.out.println("AbstractFactory PC Config::"+pc);
		System.out.println("AbstractFactory Server Config::"+server);
	}
}
