package gameAuthenticationDemo.Concrete;

import gameAuthenticationDemo.Abstract.UserValidationService;
import gameAuthenticationDemo.Entities.User;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean checkIfRealUser(User user) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
