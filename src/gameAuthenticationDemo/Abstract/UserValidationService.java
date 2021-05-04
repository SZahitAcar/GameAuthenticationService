package gameAuthenticationDemo.Abstract;

import gameAuthenticationDemo.Entities.User;

public interface UserValidationService {
	boolean checkIfRealUser(User user);
	
}
