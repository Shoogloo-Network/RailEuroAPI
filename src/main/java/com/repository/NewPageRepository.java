package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.NewPage;
public interface NewPageRepository  extends JpaRepository<NewPage, Integer> {

}
