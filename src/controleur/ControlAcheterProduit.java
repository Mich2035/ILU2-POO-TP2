package controleur;

import personnages.Gaulois;
import villagegaulois.Village;

public class ControlAcheterProduit {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlAcheterProduit(ControlVerifierIdentite controlVerifierIdentite,
			ControlTrouverEtalVendeur controlTrouverEtalVendeur,
			Village village) {
		this.village = village;
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.controlTrouverEtalVendeur = controlTrouverEtalVendeur;
	}
	public boolean demandeclientproduit(String nomAcheteur) {
			return controlVerifierIdentite.verifierIdentite(nomAcheteur);		
	}
	public String[] vendreProduit(String produit){
		Gaulois[] vendeurs=village.rechercherVendeursProduit(produit);
		if (vendeurs == null)
			return null;
		
		String[] nomVendeur=new String[vendeurs.length];
		for(int i=0;i<nomVendeur.length;i++) {
			nomVendeur[i]=vendeurs[i].getNom();
		}
	
		return nomVendeur;
	}
}
