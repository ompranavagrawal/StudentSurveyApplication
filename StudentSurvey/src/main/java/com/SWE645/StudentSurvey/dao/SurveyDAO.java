package com.SWE645.StudentSurvey.dao;


import java.util.List;
import com.SWE645.StudentSurvey.entity.Survey;


public interface SurveyDAO	 {
	public Survey saveSurvey(Survey survey);
	public List<Survey> listAllSurveys();
	public Survey getSurveyById(Long id);
	public void deleteSurvey(Long id);
	public Survey updateSurvey(Long id, Survey survey);
}