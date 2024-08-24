package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.CttFaqTbl;
public interface CttFaqTblRepository  extends JpaRepository<CttFaqTbl, Integer> {

	List<CttFaqTbl> findByFaqPageUrlOrderByFaqOrder(String pageUrl);

}
