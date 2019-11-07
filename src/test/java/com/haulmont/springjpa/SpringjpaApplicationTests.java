package com.haulmont.springjpa;

import com.haulmont.springjpa.model.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringjpaApplicationTests {

	@Autowired
	public CountryRepository countryRepository;

	@Test
	void contextLoads() {
		countryRepository.save(new Country("Russian", "RU"));
		countryRepository.save(new Country("Germany", "GE"));
		List<Country> countries = (List<Country>) countryRepository.findAll();
		countries.forEach(country -> System.out.println(country));

		Country country = countryRepository.findByName("Russian"); //magic!!!
		System.out.println(country);
	}
}
