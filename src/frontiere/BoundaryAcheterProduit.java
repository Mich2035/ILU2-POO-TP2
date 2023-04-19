package frontiere;

import java.util.Scanner;

import controleur.ControlAcheterProduit;

public class BoundaryAcheterProduit {
	private Scanner scan = new Scanner(System.in);
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
		if(controlAcheterProduit.demandeclientproduit(nomAcheteur)) {
			System.out.println("Quel produit voulez-vous acheter?");
			String produit=scan.next();
			String vendeur[]=controlAcheterProduit.vendreProduit(produit);
			int choixUtilisateur=-1;
			
			try {
			if(controlAcheterProduit.vendreProduit(produit)==null) {
				System.out.println("Il n'ya aucun vendeur qui vend le "+produit);
				System.out.println("Aurevoir "+nomAcheteur);	
			}
			}catch(Exception e) {}
			
			System.out.println("Chez quel commercant voulez-vous acheter des "+produit+" ?");
			StringBuilder question = new StringBuilder();
			for(int i=0;i<vendeur.length;i++) {
			
			question.append(i+1+" - "+vendeur[i]);
			}
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				
				if(choixUtilisateur>vendeur.length||choixUtilisateur<=0) {
					System.out.println("Vous devez choisir un chiffre entre 1 et "+vendeur.length);
				}
			System.out.println(nomAcheteur+" se deplace jusqu'a l'etal du vendeur "+vendeur[choixUtilisateur-1]);
			} while(choixUtilisateur<vendeur.length);
			System.out.println("bonjour "+nomAcheteur);
			int  quantite=Clavier.entrerEntier("Combien de "+produit+" voulez-vous acheter?");
			
			System.out.println(nomAcheteur+" a achete "+quantite+" "+produit+" a "+vendeur[choixUtilisateur-1]);
			}
			}

	}
	
			
		
	
	



