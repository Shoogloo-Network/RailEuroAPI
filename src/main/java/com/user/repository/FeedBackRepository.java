package com.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.FeedBack;

public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {


	List<FeedBack> findFeedBackBySeoUrl(Long siteId,String seoUrl);

	

}
