package gameAuthenticationDemo.Adapters;

import java.rmi.RemoteException;

import gameAuthenticationDemo.Abstract.UserValidationService;
import gameAuthenticationDemo.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserValidationService {
	
	@Override
	public boolean checkIfRealUser(User user) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		
		try {
			return client.TCKimlikNoDogrula(
					Long.parseLong(user.getNationalIdentity()),
					user.getFirstName(),
					user.getLastName(),
					user.getBirthDate().getYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
