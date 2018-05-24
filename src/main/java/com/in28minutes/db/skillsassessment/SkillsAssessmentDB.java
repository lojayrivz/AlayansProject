package com.in28minutes.db.skillsassessment;

public class SkillsAssessmentDB {
	private String mainCategory;
	
	private String subCategoryA;
	
	private String subCategoryC;
	
	private String rating;
	
	private String personRated;
	
	private String userID;
	
	private int uniqueNumber;
	
	public SkillsAssessmentDB() {
		
	}
	
	public SkillsAssessmentDB(String mainCategory, String subCategoryA, String subCategoryC, String rating, String personRated, String userID, int uniqueNumber) {
		this.setMainCategory(mainCategory);
		this.setSubCategoryA(subCategoryA);
		this.setSubCategoryC(subCategoryC);
		this.setRating(rating);
		this.setPersonRated(personRated);
		this.setUserID(userID);
		this.setUniqueNumber(uniqueNumber);
	}

	public String getMainCategory() {
		return mainCategory;
	}

	public void setMainCategory(String mainCategory) {
		this.mainCategory = mainCategory;
	}

	public String getSubCategoryA() {
		return subCategoryA;
	}

	public void setSubCategoryA(String subCategoryA) {
		this.subCategoryA = subCategoryA;
	}

	public String getSubCategoryC() {
		return subCategoryC;
	}

	public void setSubCategoryC(String subCategoryC) {
		this.subCategoryC = subCategoryC;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPersonRated() {
		return personRated;
	}

	public void setPersonRated(String personRated) {
		this.personRated = personRated;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public int getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(int uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}

}
