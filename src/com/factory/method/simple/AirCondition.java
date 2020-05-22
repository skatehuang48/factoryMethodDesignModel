package com.factory.method.simple;
/**
 * 简单工厂模式
 * 空调产品类，由子类实现接口，不同子类出售不同品牌空调，实例化交给工厂
 * @author Administrator
 *
 */
public interface AirCondition {

	public void sale();
}
