package gameAuthenticationDemo;

import java.time.LocalDate;

import gameAuthenticationDemo.Abstract.BaseManager;
import gameAuthenticationDemo.Adapters.MernisServiceAdapter;
import gameAuthenticationDemo.Concrete.GameManager;
import gameAuthenticationDemo.Concrete.UserManager;
import gameAuthenticationDemo.Entities.Campaign;
import gameAuthenticationDemo.Entities.Game;
import gameAuthenticationDemo.Entities.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User zahit = new User(1,"Selami Zahit" , "Acar" , "XXXXXXXXX", LocalDate.of(2000, 1, 1));
		Game csgo = new Game(1,"CSGO",25);
		Campaign winterIsComing =new  Campaign(1,"WinterIsComing",10);
		
		BaseManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(zahit);
		
		BaseManager gameManager = new GameManager();
		gameManager.add(csgo);
		gameManager.buy(csgo, zahit);
		gameManager.buy(csgo, zahit, winterIsComing);
	}

}
