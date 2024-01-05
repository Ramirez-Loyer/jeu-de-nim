package jeuDeNim;

import java.util.Scanner;

public class allumette {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Demander les noms des joueurs
		System.out.print("Nom du joueur 1 : ");
		String nomA = scanner.nextLine();
		System.out.print("Nom du joueur 2 : ");
		String nomB = scanner.nextLine();

		// Demander quel joueur commence
		System.out.print("Quel joueur commence la partie (1 ou 2) ? ");
		int joueurInitial = scanner.nextInt();

		// Initialiser le num d'allumettes
		int nbAllumettesRestantes  = 21;

		// Demander au joueur qui commence de retirer des allumettes
		int joueurActuel = joueurInitial;
		int nbAllumettes;
		boolean jeuFini = false;

		while (!jeuFini) {

			System.out.println("Allumettes : " + nbAllumettesRestantes);

			do {

				if(joueurActuel == 1) {
					System.out.print(nomA);
				}else {
					System.out.print(nomB);
				}
				System.out.print(", combien d'allumettes voulez-vous retirer (entre 1 et 4) ? ");
				nbAllumettes = scanner.nextInt(); 

			} while (nbAllumettes > nbAllumettesRestantes || nbAllumettes > 4 || nbAllumettes < 1);


			//Mettre à jour le num d'allumettes
			nbAllumettesRestantes -= nbAllumettes;
			System.out.println(nbAllumettesRestantes);

			//Ferme la boucle
			if (nbAllumettesRestantes == 0) {
				jeuFini = true;
			}


			//Changer de joueur//


			if(joueurActuel== 1) {
				joueurActuel = 2;
			} else {
				joueurActuel = 1;
			}

		}
		
		//Annoncer le joueur perdant
		if (joueurActuel == 2) {
			System.out.println(nomA + " perd ! ");
			
		} else {
			System.out.println(nomB + " perd ! ");
		}
	}	
}

