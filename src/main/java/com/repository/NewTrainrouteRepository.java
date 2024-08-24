package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.NewTrainroute;
public interface NewTrainrouteRepository  extends JpaRepository<NewTrainroute, Integer> {

	List<NewTrainroute> findByTrainrouteStatusOrderByTrainroutePopularorder(String string);

	List<NewTrainroute> findByTrainrouteStatusAndTrainrouteUrlOrderByTrainroutePopularorder(String string,
			String pageurl);

} 
