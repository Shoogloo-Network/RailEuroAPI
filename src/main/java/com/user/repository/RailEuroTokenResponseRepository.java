package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.TokenMaster;

public interface RailEuroTokenResponseRepository  extends JpaRepository<TokenMaster, Long> {
	TokenMaster findTop1ByOrderByIdDesc();
}
