package com.in28minutes.db.skillsassessment;

public class SkillsAssessmentDB {
	
	private String uniqueNumber;
	
	private String mainCategory;
	
	private String subCategoryA;
	
	private String subCategoryC;
	
	private String rating;
	
	private String personRated;
	
	private String userID;
	
	public SkillsAssessmentDB() {
		
	}
	
	public SkillsAssessmentDB(String uniqueNumber ,String mainCategory, String subCategoryA, String subCategoryC, String rating, String personRated, String userID) {
		super();
		this.setUniqueNumber(uniqueNumber);
		this.setMainCategory(mainCategory);
		this.setSubCategoryA(subCategoryA);
		this.setSubCategoryC(subCategoryC);
		this.setRating(rating);
		this.setPersonRated(personRated);
		this.setUserID(userID);
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

	public String getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(String uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}

}
