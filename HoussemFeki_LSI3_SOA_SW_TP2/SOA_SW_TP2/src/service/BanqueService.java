package Service;

import java.util.List;

public class BanqueService {

	public double conversion(double montant) {
		double m;
		m=montant * 3.6;
		return m;	
	}
	public Compte getCompte(Compte c) {
		return c;
	}	
	public List<Compte> getComptes(List<Compte> c) {
		return c;
	}
}
