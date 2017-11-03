package io.study.services;

import io.study.data.UserData;
import io.study.domain.User;

public class UserServiceMockImp implements UserService {

	private UserData  dao;

	public void setDao(UserData  dao) {
		this.dao = dao;
	}

	
	public void registerANewUserToDB(User user) {
		dao.addUser(user);
	}

	public void deleteUserFromDB() {
		dao.deleteUser();
	}

	public void updateUserInDB() {

		dao.updateUser();

	}

}
