package com.factory.method.simple.air;

import com.factory.method.simple.AirCondition;
/**
 * 
 * 海尔空调产品类
 * @author Administrator
 *
 */
public class AirConditionHaier implements AirCondition {

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("出售海尔空调产品");
	}

}
