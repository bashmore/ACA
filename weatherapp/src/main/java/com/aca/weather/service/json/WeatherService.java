package com.aca.weather.service.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import com.aca.weather.bean.json.WeatherBean;
import com.fasterxml.jackson.core.json.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherService {
	
	private final String weatherUrl = "http://api.openweathermap.org/data/2.5/weather";
	private final String country = "US";
	private final String appid = "d2af75a7520b14347483602c5e004c1f";
	private final String mode = "json";
	private final String units = "imperial"; 
	
	public WeatherBean getWeatherByCity(String city) {

		WeatherBean bean = null;
		try {
			bean = start(city);
		} catch (Exception e) {
			
		}
		return bean;
	}

	private WeatherBean start(String city) throws Exception {

		String myRequest = getMyWeatherRequest(city);
		
		URL requestUrl = new URL(myRequest);
		HttpURLConnection con = getConnection(requestUrl);
		int responseCode = con.getResponseCode();
		String responseBody = getResponseBody(con);
		
		System.out.println("Response Code : " + responseCode);
		
		// convert to Java object
		ObjectMapper objectMapper = new ObjectMapper();
		
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		//needed in order to skip yet to be mapped elements/attributes
		WeatherBean bean = objectMapper.readValue(responseBody, WeatherBean.class);
		
		return bean;
		
	}
	

	
	private String getResponseBody(HttpURLConnection con) throws IOException {
		BufferedReader in = new BufferedReader(
				new InputStreamReader(con.getInputStream()));
		
		String inputLine = null;
		StringBuffer response = new StringBuffer();
		
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		return response.toString();
	}
	
	private HttpURLConnection getConnection(URL requestUrl) throws IOException {
		HttpURLConnection con = (HttpURLConnection) requestUrl.openConnection();
		return con;
	}
	
	
private String getMyWeatherRequest(String city) {
	
	StringBuffer myRequest = new StringBuffer();
	myRequest.append(weatherUrl);
	myRequest.append("?");
	myRequest.append("q=" + city + "," + country);
	myRequest.append("&");
	myRequest.append("appid=" + appid);
	myRequest.append("&");
	myRequest.append("mode=" + mode);
	myRequest.append("&");
	myRequest.append("units=" + units);
	
	System.out.println(myRequest.toString());
	
	return myRequest.toString();
}










}
	

