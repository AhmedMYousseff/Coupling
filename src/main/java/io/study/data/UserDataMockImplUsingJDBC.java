package io.study.data;

import org.springframework.jdbc.core.JdbcTemplate;

import io.study.domain.User;

public class UserDataMockImplUsingJDBC implements UserData {
	
	private JdbcTemplate jdbcTemplate;
	
	private  static final String CREATE_USER_TABLE ="create table User (name varchar(50),email varchar(50))";
	private static final String INSERT_USER = "insert into User (name,email) values(?,?)";
	public UserDataMockImplUsingJDBC() {}
	public UserDataMockImplUsingJDBC(JdbcTemplate jdbcTemplate) {
		
		this.jdbcTemplate = jdbcTemplate;
		
		try {		
		jdbcTemplate.update(CREATE_USER_TABLE );
		}
		catch (Exception e) {
			System.err.println(e);
			System.out.println("Table already exists");
		}
	}

	public void addUser(User user) {
		
		
		jdbcTemplate.update(INSERT_USER, user.getUser(),user.getEmail());
			
	}

	public void deleteUser() {
		System.out.println("Delete User From Database using JDBC");
		
	}

	public void updateUser() {
		System.out.println("Update User in  Database using JDBC");
		
	}



}
