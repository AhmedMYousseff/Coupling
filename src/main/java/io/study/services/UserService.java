package io.study.services;

import io.study.domain.User;

public interface UserService {
	public void registerANewUserToDB(User user);
	public void deleteUserFromDB();
	public void updateUserInDB();
}
