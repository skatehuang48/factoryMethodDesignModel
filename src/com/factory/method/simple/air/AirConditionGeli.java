package com.factory.method.simple.air;

import com.factory.method.simple.AirCondition;

/**
 * 具体的空调 格力空调
 * @author Administrator
 *
 */
public class AirConditionGeli implements AirCondition{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("出售格力空调产品");
	}

}
