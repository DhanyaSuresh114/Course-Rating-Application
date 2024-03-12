package com.microservice.user.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

	@Id
	private String userId;
	
	private String name;
	
	private String email;
	
	private String qualification;
	
	private Long contactnumber;

	@Transient
	private List<Rating> ratings = new ArrayList<>();
	

}
