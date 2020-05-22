package com.factory.method.simple.factory;

import com.factory.method.simple.AirCondition;
import com.factory.method.simple.air.AirConditionHaier;

public class HaierSaleFacotry implements SaleFactory {

	@Override
	public AirCondition getAirCondition() {
		// TODO Auto-generated method stub
		return new AirConditionHaier();
	}

}
