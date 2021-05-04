package gameAuthenticationDemo.Abstract;

import gameAuthenticationDemo.Entities.Campaign;
import gameAuthenticationDemo.Entities.Game;
import gameAuthenticationDemo.Entities.User;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
	void buy(Game game, User user);
	void buy(Game game,User user,Campaign campaign);
}
