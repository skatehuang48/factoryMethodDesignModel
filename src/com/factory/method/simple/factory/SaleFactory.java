package com.factory.method.simple.factory;

import com.factory.method.simple.AirCondition;

/**
 * 工厂方法模式 工厂抽象类 抽象出空调店 负责出售各种空调
 * @author Administrator
 *
 */
public interface SaleFactory {
	public AirCondition getAirCondition();
}
