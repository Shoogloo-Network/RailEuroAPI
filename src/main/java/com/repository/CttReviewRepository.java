package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.CttReview;
public interface CttReviewRepository  extends JpaRepository<CttReview, Integer> {
	@Query(value = "SELECT * FROM CttReview u WHERE u.review_page_url = ?1 and rting=?2 order by review_date limit ?3", 
			  nativeQuery = true)
	List<CttReview> findTopByPageUrlAndRating(String pageUrl, Integer rating,Integer limit);
	@Query(value = "SELECT * FROM CttReview u WHERE u.review_page_url = ?1  order by review_date limit ?2", 
			  nativeQuery = true)
	List<CttReview> findTopByPageUrl(String pageUrl, Integer pageSize);
	@Query(value = "SELECT * FROM CttReview u  order by review_date limit ?1", 
			  nativeQuery = true)
	List<CttReview> findTop(Integer pageSize);

}
