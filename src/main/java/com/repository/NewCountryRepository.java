package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.NewCountry;
public interface NewCountryRepository  extends JpaRepository<NewCountry, Integer> {

}
