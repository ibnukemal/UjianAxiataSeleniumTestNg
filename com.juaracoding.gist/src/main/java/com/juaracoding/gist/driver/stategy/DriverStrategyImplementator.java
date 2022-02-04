package com.juaracoding.gist.driver.stategy;

import com.juaracoding.gist.utils.Constant;

public class DriverStrategyImplementator {

	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constant.CHROME:
			return new Chrome();
			
		case Constant.FIREFOX:
			return new Firefox();

		default:
			return null;
		}
	}
}
	
	
