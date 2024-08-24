package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.TravelerDetail;
public interface TravelerDetailRepository  extends JpaRepository<TravelerDetail, Long> {

	List<TravelerDetail> findByUserId(Long userId);

	TravelerDetail findByUserIdAndAlias(Long userId, String alias);

	List<TravelerDetail> findByUserIdAndAlias(Long userId, Long alias);
	

}
