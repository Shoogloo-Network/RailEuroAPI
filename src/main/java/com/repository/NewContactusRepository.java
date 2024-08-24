package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.NewContactus;
public interface NewContactusRepository  extends JpaRepository<NewContactus, Integer> {

}
