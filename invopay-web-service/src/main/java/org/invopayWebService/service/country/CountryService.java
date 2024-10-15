package org.invopayWebService.service.country;


import org.invopayWebService.entity.Country;
import org.invopayWebService.repository.country.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;
    public String getCountryNameById(int id) {
        return countryRepository.findByCountryId(id).getIsoCode3();
    }

    public List<Country> getCountry() {
        return  countryRepository.findAll();
    }
}
