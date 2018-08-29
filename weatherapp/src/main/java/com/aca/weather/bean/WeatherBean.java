package com.aca.weather.bean;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "current")
public class WeatherBean {

	@JacksonXmlProperty(localName = "temperature")
	private TemperatureBean temperatureBean;

	public TemperatureBean getTemperatureBean() {
		return temperatureBean;
	}

	public void setTemperatureBean(TemperatureBean temperatureBean) {
		this.temperatureBean = temperatureBean;
	}
	
	
	@JacksonXmlProperty(localName = "wind")
	private WindBean windBean;

	public WindBean getWindBean() {
		return windBean;
	}

	public void setWindBean(WindBean windBean) {
		this.windBean = windBean;
	}
	
	
	
}
