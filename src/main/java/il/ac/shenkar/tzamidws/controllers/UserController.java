package il.ac.shenkar.tzamidws.controllers;

import il.ac.shenkar.tzamidws.daos.UserDao;
import il.ac.shenkar.tzamidws.models.User;
import il.ac.shenkar.tzamidws.services.LoginService;

public class UserController {

	private UserDao userDao;
	private LoginService loginService;

	public UserController() {
		this.userDao = UserDao.getInstance();
		this.loginService = LoginService.getInstance();
	}

	public boolean loginUser(String username){
		return loginService.loginUser(username);
	}

	public User getUserByUserId(int userId){
		return userDao.getUserByUserId(userId);
	}

	public User getUserByUserName(String userName){
		return userDao.getUserByUserName(userName);
	}

	public void saveNewUser(User user){
		userDao.saveNewUser(user);
	}

	public void updateUser(User user){
		userDao.updateUser(user);
	}

	public void removeUser(int userId){
		userDao.removeUser(userId);
	}

}
