package com.aca.weather.bean.json;

public class MainBean {
	
	double temp;
	
	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	@Override
	public String toString() {
	
		return "\n" + "temp: " + temp;
	}
	
}	
