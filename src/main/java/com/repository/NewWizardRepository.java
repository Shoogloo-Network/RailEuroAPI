package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.NewWizard;
public interface NewWizardRepository  extends JpaRepository<NewWizard, Integer> {

}
