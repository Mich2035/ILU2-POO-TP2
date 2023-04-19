package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes dejà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					emmenagerGaulois(nomVisiteur);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		System.out.println("Bienvenu Druide"+ nomVisiteur);
		System.out.println("Quelle est votre force?");
		int choixforcemin,choixforcemax;
		do {
		choixforcemin=Clavier.entrerEntier("Quelle est la force la plus faible que vous produisez");
		choixforcemax=Clavier.entrerEntier("Quelle est la force la plus forte que vous produisez");
		if(choixforcemax<choixforcemin) {
			System.out.println("Attention,druide, vous vous êtes trompés entre le minimum et le maximum");
		}
		}
		while(choixforcemin > choixforcemax) ;
		controlEmmenager.ajouterDruide(nomVisiteur, choixforcemax, choixforcemin, choixforcemax);
			
		}
	public void emmenagerGaulois(String nomVisiteur) {
		
		System.out.println("Bienvenu villageois"+ nomVisiteur);
		
		int force=Clavier.entrerEntier("Quelle est votre force ");
		controlEmmenager.ajouterGaulois(nomVisiteur, force);
		
		
		
		
	}
	}
	
	

