package com.handson.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

	private String name;
	private String gender;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//	public Member(String name, String gender) {
//		super();
//		this.name = name;
//		this.gender = gender;
//	}
//	public Member() {
//		// TODO Auto-generated constructor stub
//	}
}
