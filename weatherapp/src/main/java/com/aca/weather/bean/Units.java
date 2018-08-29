package com.aca.weather.bean;

public enum Units { Kelvin("kelvin"), Celsius("metric"), Fahrenheit("imperial");

	private String value;
	
	Units(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}


}
