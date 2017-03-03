package il.ac.shenkar.tzamidws.services;

public class LoginService {
	private static LoginService loginService = new LoginService();

	public static LoginService getInstance() {
		return loginService;
	}

	private LoginService() {
	}

	public boolean loginUser(String username) {
		return false;
	}
}
