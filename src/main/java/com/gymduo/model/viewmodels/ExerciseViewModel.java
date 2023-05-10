package com.gymduo.model.viewmodels;

import java.util.List;

public class ExerciseViewModel {
	public String name;
	public String description;
	public String photoURL;
	public String videoURL;
	public List<ExerciseRecordViewModel> exerciseRecords;
	
	public ExerciseViewModel() {
		// TODO Auto-generated constructor stub
	}

	public ExerciseViewModel(String name, String description, String photoURL, String videoURL) {
		super();
		this.name = name;
		this.description = description;
		this.photoURL = photoURL;
		this.videoURL = videoURL;
	}
	
	
}
