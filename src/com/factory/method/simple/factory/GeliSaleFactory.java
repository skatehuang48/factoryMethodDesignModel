package com.factory.method.simple.factory;

import com.factory.method.simple.AirCondition;
import com.factory.method.simple.air.AirConditionGeli;

public class GeliSaleFactory implements SaleFactory {

	@Override
	public AirCondition getAirCondition() {
		// TODO Auto-generated method stub
		return new AirConditionGeli();
	}

}
