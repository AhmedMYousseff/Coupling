package io.study.data;

import io.study.domain.User;

public class UserDataMockImplUsingHiberna implements UserData{
	
	
	public void addUser(User user) {

		// act like it is a real data from database
		System.out.println("Add User To Database using Jpa");

	}

	public void deleteUser() {
		System.out.println("Delete User From Database using Jpa");

	}

	public void updateUser() {
		System.out.println("Update User in  Database using Jpa");

	}

}
