package il.ac.shenkar.tzamidws.daos;

import il.ac.shenkar.tzamidws.models.User;

public class UserDao {

	private static UserDao userDao = new UserDao();

	public static UserDao getInstance() {
		return userDao;
	}

	private UserDao() {
	}

	public User getUserByUserId(int userId) {
		return null;
	}

	public User getUserByUserName(String userName) {
		return null;
	}

	public void saveNewUser(User user) {

	}

	public void updateUser(User user) {

	}

	public void removeUser(int userId) {

	}
}
