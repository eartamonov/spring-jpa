package com.haulmont.springjpa;

import com.haulmont.springjpa.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Country findByName(String name);
}
