package com.in28minutes.db.skillsassessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsAssessmentService {

	@Autowired
	SkillsAssessmentRepository skillsAssessmentRepository;
	
	public List<SkillsAssessmentDB> getAllUsers(){
		List<SkillsAssessmentDB> users = new ArrayList<>();
		skillsAssessmentRepository.findAll()
		.forEach(users::add);
		return users;
		
	}
	
	public void addUser(SkillsAssessmentDB user) {
		skillsAssessmentRepository.save(user);
	}
	
	public Optional<SkillsAssessmentDB> getUser(String id) {
		return skillsAssessmentRepository.findById(id);
	}
	
	public void updateUser(String id, SkillsAssessmentDB user) {
		skillsAssessmentRepository.save(user);
	}
	
	public void deleteUser(String id) {
		skillsAssessmentRepository.deleteById(id);
	}
}
