package com.SWE645.StudentSurvey.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SWE645.StudentSurvey.entity.Survey;

public interface SurveyRepositoryInterface extends JpaRepository<Survey, Long>{

}
