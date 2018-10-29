package com.cg.spring2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="traineedb")
public class TraineeDTO {
	
	@Id
	@Column(name="trainee_id")
	private int traineeId;
	@Column(name="trainee_name")
	private String traineeName;
	@Column(name="trainee_domain")
	private String traineeDomain;
	@Column(name="trainee_location")
	private String traineeLocation;
	
	public TraineeDTO(){
		
	}
	
	public TraineeDTO(int traineeId, String traineeName, String traineeDomain, String traineeLocation ){
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}
	
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	@Override
	public String toString() {
		return "TraineeDTO [traineeId=" + traineeId + ", traineeName="
				+ traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + "]";
	}
	
}
