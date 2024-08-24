package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.LogDB;

public interface LogDBRepository  extends JpaRepository<LogDB, Long> {

}
