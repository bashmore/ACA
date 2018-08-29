package com.aca.weather.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class WindBean {

	@JacksonXmlProperty(isAttribute = true, localName = "speed")
	private SpeedBean speedBean;

	public SpeedBean getSpeedBean() {
		return speedBean;
	}

	public void setSpeedBean(SpeedBean speedBean) {
		this.speedBean = speedBean;
	}
	
	
}
