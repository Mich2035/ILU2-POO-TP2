package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] infos=controlAfficherMarche.donnerInfosMarche();
		int i=0;String vendeur,quantite,produit;
		if (infos.length==0) {
			System.out.println("Le marché est vide, revenez plus tard");
		}
		else {
			System.out.println(nomAcheteur+" vous trouverez au marché:");
			while(i<infos.length) {
				vendeur=infos[i];
				i+=1;
				quantite=infos[i];
				i++;
				produit=infos[i];
				System.out.println("-"+ vendeur+" qui vend "+quantite+" "+produit);
				i++;
			}
				
			
		}

	}
}
