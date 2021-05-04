package gameAuthenticationDemo.Abstract;

import gameAuthenticationDemo.Entities.Campaign;
import gameAuthenticationDemo.Entities.Game;
import gameAuthenticationDemo.Entities.User;

public abstract class BaseManager implements UserService,GameService,CampaignService{

	@Override
	// ayri bir kampanya uygulama methodu kullanilabilir.
	public double apply(Game game, Campaign campaign) {
		double discountRatio = campaign.getDiscount()/100;
		double netDiscount = game.getPrice() * discountRatio;
		double lastPrice = game.getPrice()-netDiscount;
		return lastPrice;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+ " Oyunu Veritabanina Eklendi");
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+ " Oyunu Veritabaninda Guncellendi");
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+ " Oyunu Veritabanindan Silindi");
	}

	@Override
	public void buy(Game game, User user) {
		// TODO Auto-generated method stub
		System.out.println(game.getName()+ " Oyunu "+ user.getFirstName() + " Adli kullanici tarafindan " + game.getPrice() + " fiyatiyla satin alindi.");
		
	}

	@Override
	public void buy(Game game, User user, Campaign campaign) {
		// TODO Auto-generated method stub
		double discountRatio = campaign.getDiscount()/100;
		double netDiscount = game.getPrice() * discountRatio;
		double lastPrice = game.getPrice()-netDiscount;
		System.out.println(game.getName()+ " Oyunu "+ user.getFirstName() + " Adli kullanici tarafindan " + lastPrice + " fiyatiyla satin alindi." );
		
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName()+" Oyuncu Veritabanina Kayit Edildi.");
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName()+" Oyuncunun Veritabani Bilgileri Guncellendi.");
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName()+" Oyuncu Veritabanindan Silindi.");
		
	}
	
	
	

}
