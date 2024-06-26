package com.SWE645.StudentSurvey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SWE645.StudentSurvey.dao.SurveyDAO;
import com.SWE645.StudentSurvey.dao.SurveyRepositoryInterface;
import com.SWE645.StudentSurvey.entity.Survey;

@Service
public class SurveyService implements SurveyDAO {
	
	@Autowired
	private SurveyRepositoryInterface surveyRepository;
	
	@Override
	public Survey saveSurvey(Survey survey) {
		return surveyRepository.save(survey);
	}

	@Override
	public List<Survey> listAllSurveys() {
		return surveyRepository.findAll();
	}

	@Override
	public Survey getSurveyById(Long id) {
		return surveyRepository.findById(id).orElseThrow(() -> new RuntimeException("Incorrect Id : "+id));
	}

	@Override
	public void deleteSurvey(Long id) {
		surveyRepository.deleteById(id);
		
	}

	@Override
	public Survey updateSurvey(Long id, Survey newSurvey) {
		Survey survey = getSurveyById(id);
		survey.setFirstName(newSurvey.getFirstName());
		survey.setLastName(newSurvey.getLastName());
        survey.setStreetAddress(newSurvey.getStreetAddress());
        survey.setCity(newSurvey.getCity());
        survey.setState(newSurvey.getState());
        survey.setZip(newSurvey.getZip());
        survey.setTelephone(newSurvey.getTelephone());
        survey.setEmail(newSurvey.getEmail());
        survey.setDateOfSurvey(newSurvey.getDateOfSurvey());
        survey.setStudents(newSurvey.getStudents());
        survey.setLocation(newSurvey.getLocation());
        survey.setCampus(newSurvey.getCampus());
        survey.setAtmosphere(newSurvey.getAtmosphere());
        survey.setDormRoom(newSurvey.getDormRoom());
        survey.setSports(newSurvey.getSports());
        survey.setInterestedToUniversity(newSurvey.getInterestedToUniversity());
        survey.setRecommendation(newSurvey.getRecommendation());
		return surveyRepository.save(survey);
	}
	
}
