package com.aca.weather.client.json;

import com.aca.weather.bean.json.WeatherBean;
import com.aca.weather.service.json.*;

public class WeatherApiTest {

	public static void main(String[] args) {

		WeatherService service = new WeatherService();
		
		WeatherBean bean = service.getWeatherByCity("Destin");
		
		System.out.println("bean: " + bean);
		
//		System.out.println("base: " + bean.getBase());
//		System.out.println("code: " + bean.getCod());
//		System.out.println("dt: " + bean.getDt());
//		System.out.println("id: " + bean.getId());		
//		System.out.println("name: " + bean.getName());
//		System.out.println("visibility: " + bean.getVisibility());

		System.out.println("main.temp: " + bean.getMain().getTemp());
		System.out.println("size of list: " + bean.getWeather().size());
		
		System.out.println("=====================");
		System.out.println("bean: " + bean.toString() + "\n");
		
		System.out.println(bean.getWeatherDate());
		

	}

}
