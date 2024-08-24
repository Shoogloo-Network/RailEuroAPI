package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.NewTrainoperator;
public interface NewTrainoperatorRepository  extends JpaRepository<NewTrainoperator, Integer> {

	List<NewTrainoperator> findByTrainOperatorStatusOrderByTrainOperatorPopularorder(String string);

	List<NewTrainoperator> findByTrainOperatorStatusAndTrainOperatorUrlOrderByTrainOperatorPopularorder(String string,
			String pageurl);

}
