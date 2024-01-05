package jeuDeNim;

import java.util.Scanner;

public class JeuNim {

	public static void main(String[] args) {
		
		// Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander les noms des joueurs
        System.out.print("Nom du joueur 1 : ");
        String joueur1 = scanner.nextLine();
        System.out.print("Nom du joueur 2 : ");
        String joueur2 = scanner.nextLine();

        // Initialiser le nombre d'allumettes
        int allumettes = 21;

        // Boucle principale du jeu
        while (allumettes > 0) {
            // Afficher le nombre d'allumettes restantes
            System.out.println("Allumettes restantes : " + allumettes);

            // Demander au joueur actuel de retirer des allumettes
            int nbAllumettes = demanderAllumettes(joueur1, joueur2, scanner);

            // Mettre à jour le nombre d'allumettes
            allumettes -= nbAllumettes;
        }

        // Annoncer la fin du jeu
        System.out.println("Le jeu est terminé. Merci d'avoir joué !");
    }

    // Méthode pour demander au joueur de retirer des allumettes
    private static int demanderAllumettes(String joueur1, String joueur2, Scanner scanner) {
        int nbAllumettes = 0;

        // Demander au joueur de saisir un nombre d'allumettes valide (entre 1 et 4)
        while (nbAllumettes < 1 || nbAllumettes > 4) {
            System.out.print(joueur1 + " et " + joueur2 + ", combien d'allumettes voulez-vous retirer (entre 1 et 4) ? ");
            nbAllumettes = scanner.nextInt();
        }

        // Renvoyer le nombre d'allumettes saisi par le joueur
        return nbAllumettes;
    }
}