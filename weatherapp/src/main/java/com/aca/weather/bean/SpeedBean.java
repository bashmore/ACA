package com.aca.weather.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SpeedBean {

	@JacksonXmlProperty(isAttribute = true, localName = "value")
	private String value;
	
	@JacksonXmlProperty(isAttribute = true, localName = "name")
	private String name;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("current speed: " + getValue() + "\n");
		buffer.append("type of speed:  " + getName() + "\n");
		
		return buffer.toString();
	}
	
	
}
