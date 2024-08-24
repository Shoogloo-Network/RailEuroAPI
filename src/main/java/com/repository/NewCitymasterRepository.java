package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.NewCitymaster;
public interface NewCitymasterRepository  extends JpaRepository<NewCitymaster, Integer> {

	List<NewCitymaster> findByStatusCode(String status);

	List<NewCitymaster> findByCode(String name);

}
