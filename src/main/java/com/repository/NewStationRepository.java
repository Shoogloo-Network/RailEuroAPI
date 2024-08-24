package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.NewStation;
public interface NewStationRepository  extends JpaRepository<NewStation, Integer> {

}
