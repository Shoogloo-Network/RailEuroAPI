package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.UserLog;



public interface UserLogRepository extends JpaRepository<UserLog, Long>{

	

}
