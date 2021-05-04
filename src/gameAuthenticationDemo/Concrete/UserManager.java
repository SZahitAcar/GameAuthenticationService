package gameAuthenticationDemo.Concrete;

import gameAuthenticationDemo.Abstract.BaseManager;
import gameAuthenticationDemo.Abstract.UserValidationService;
import gameAuthenticationDemo.Entities.User;

public class UserManager extends BaseManager {
	private UserValidationService userValidationService;
	
	public UserManager(UserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(User user) {
		if(userValidationService.checkIfRealUser(user)) {
			super.add(user);
		}else {
		System.out.println("Not A Valid User");
		}

	}

	
}
