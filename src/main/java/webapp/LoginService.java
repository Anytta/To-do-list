package webapp;

// this class checks if the name and password of the users are correct

public class LoginService {

	public boolean isUserValid(String user, String password) {

		if (user.equals("Anita") && password.equals("r2018")) {
			return true;
		}
		return false;
	}

}
