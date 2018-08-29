package com.aca.weather.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TemperatureBean {
	
	@JacksonXmlProperty(isAttribute = true, localName = "value")
	private String value;
	
	@JacksonXmlProperty(isAttribute = true, localName = "min")
	private String min;
	
	@JacksonXmlProperty(isAttribute = true, localName = "max")
	private String max;
	
	@JacksonXmlProperty(isAttribute = true, localName = "unit")
	private String unit;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n");
		buffer.append("	current temp: " + getValue() + "\n");
		buffer.append("		min temp: " + getMin() + "\n");
		buffer.append("		max temp: " + getMax() + "\n");
		buffer.append("		unit temp: " + getUnit() + "\n");
		
		return buffer.toString();
		
		
	}

}
