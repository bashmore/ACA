package com.aca.weather.bean.json;

public class WeatherDescBean {
	
	int id;
	String main;
	String description;
	String icon;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	@Override
	public String toString() {
		
		return "\n" + "id: " + id + 
				"\n" + "description: " + description;

	}

}
