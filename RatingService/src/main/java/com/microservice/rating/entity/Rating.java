package com.microservice.rating.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

	@Id
	private String ratingId;

	private String userId;

	private String courseId;

	private int rating;

	private String feedback;

}