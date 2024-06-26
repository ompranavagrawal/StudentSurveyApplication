package com.SWE645.StudentSurvey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SWE645.StudentSurvey.entity.Survey;
import com.SWE645.StudentSurvey.service.SurveyService;

@RestController
@RequestMapping("/survey")
@CrossOrigin("*")
public class SurveyController {	
	@Autowired
	private SurveyService surveyService;
	
	@PostMapping
	public ResponseEntity<Survey> saveStudentSurvey(@RequestBody Survey survey){
		Survey savedSurvey= surveyService.saveSurvey(survey);
		return new ResponseEntity<>(savedSurvey, HttpStatus.OK);
	}
	
	@GetMapping
    public ResponseEntity<List<Survey>> listAllSurveys() {
        List<Survey> listOfSurveys = surveyService.listAllSurveys();
        return new ResponseEntity<>(listOfSurveys, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSurveyById(@PathVariable Long id) {
    	try {
	        Survey surveyById = surveyService.getSurveyById(id);
	        return new ResponseEntity<>(surveyById, HttpStatus.OK);
    	}
    	catch(Exception e) {
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Id doesn't exist.");
    	}
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSurvey(@PathVariable Long id) {
    	if(getSurveyById(id).getStatusCode() == HttpStatus.BAD_REQUEST) {
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Id doesn't exist.");
    	}else {
    		surveyService.deleteSurvey(id);
    		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSurvey(@PathVariable Long id, @RequestBody Survey surveyDetails) {
    	try {
	        Survey updatedSurvey = surveyService.updateSurvey(id, surveyDetails);
	        return new ResponseEntity<>(updatedSurvey, HttpStatus.OK);
    	} catch (Exception e) {
    		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Id doesn't exist.");
		}
    }

    
	

	
}
