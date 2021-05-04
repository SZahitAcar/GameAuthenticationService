package gameAuthenticationDemo.Abstract;

import gameAuthenticationDemo.Entities.Campaign;
import gameAuthenticationDemo.Entities.Game;

public interface CampaignService {
	double apply(Game game, Campaign campaign);
}
