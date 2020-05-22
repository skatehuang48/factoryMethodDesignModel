package com.factory.method.simple.factory;

import com.factory.method.simple.AirCondition;

public class Test {

	public static void main(String[] args) {
		AirCondition geli = new GeliSaleFactory().getAirCondition();
		geli.sale();
	}
}
