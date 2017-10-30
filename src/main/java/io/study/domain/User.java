package io.study.domain;

import lombok.Data;

@Data
public class User {
	private Integer id;
	private String user;
	private String email;
	
	public User(Integer id, String user, String email) {
	
		this.id = id;
		this.user = user;
		this.email = email;
	}
	public User( String user, String email) {

		this.user = user;
		this.email = email;
	}
	
	
	
	


}
