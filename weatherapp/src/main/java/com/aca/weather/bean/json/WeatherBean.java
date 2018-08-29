package com.aca.weather.bean.json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WeatherBean {
	
	private String base;
	private int visibility;
	private int dt;
	private int id;
	private String name;
	private int cod;
	
	private MainBean main;
	private List<WeatherDescBean> weather = new ArrayList<WeatherDescBean>();
	
	
	public MainBean getMain() {
		return main;
	}
	public void setMain(MainBean main) {
		this.main = main;
	}
	public List<WeatherDescBean> getWeather() {
		return weather;
	}
	public void setWeather(List<WeatherDescBean> weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public Date getWeatherDate() {
		Date date = new Date();
		return date;
	}
	
	@Override
	public String toString() {
		String value = "\n" + "base: " + base + "\n" + "visibiltiy: " + visibility;
		
		value = value + main.toString();
		value = value + "\n" + "weather: " + weather.toString();
		
		return value;
	}
	
	
}
