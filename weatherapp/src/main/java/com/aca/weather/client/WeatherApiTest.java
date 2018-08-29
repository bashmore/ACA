package com.aca.weather.client;

import com.aca.weather.bean.SpeedBean;
import com.aca.weather.bean.TemperatureBean;
import com.aca.weather.bean.Units;
import com.aca.weather.bean.WeatherBean;
import com.aca.weather.service.WeatherService;

public class WeatherApiTest {

	public static void main(String[] args) {

		WeatherService service = new WeatherService();
		
		WeatherBean bean = service.getWeatherByCity("Destin");
		
		
		
		System.out.println("bean: " + bean);
		
		TemperatureBean temp = bean.getTemperatureBean();
				
		System.out.println("temperature bean" + temp.toString());
		
		SpeedBean speed = bean.getWindBean().getSpeedBean();
		
		System.out.println(speed);

	}

}
