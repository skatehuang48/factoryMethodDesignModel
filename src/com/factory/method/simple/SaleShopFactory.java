package com.factory.method.simple;

import com.factory.method.simple.air.AirConditionGeli;
import com.factory.method.simple.air.AirConditionHaier;

/**
 * 简单工厂类 ，根据参数负责生产不同的空调
 * @author Administrator
 *
 */
public class SaleShopFactory {

	/**
	 * 简单工厂 根据传参获取不同的空调
	 * @param type
	 * @return
	 */
	public AirCondition getAirCondittion(String type){
		AirCondition airCondition = null;
		if(type.equals("geli")){
			airCondition =  new AirConditionGeli();
		}else if(type.equals("haier")){
			airCondition = new AirConditionHaier();
		}
		return airCondition;
	}
	
	public static void main(String[] args) {
		SaleShopFactory sale = new SaleShopFactory();
		AirCondition haier = sale.getAirCondittion("haier");
		haier.sale();
		AirCondition geli = sale.getAirCondittion("geli");
		geli.sale();
	}
}
