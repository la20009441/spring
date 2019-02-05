package com.wipro.fsd.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.fsd.springdi.model.Country;

@Configuration
public class CountryConfig {

	@Bean
	public Country india() {
		Country country = new Country();
		country.setCountryId("C001");
		country.setCountryName("India");
		return country;
	}

	@Bean
	public Country england() {
		Country country = new Country();
		country.setCountryId("C002");
		country.setCountryName("England");
		return country;
	}

}
