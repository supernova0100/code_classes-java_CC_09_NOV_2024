// Classe principale : Banque2.java
public class Banque2 {
    public static void main(String[] args) {
        // Création de la banque
        Banque banque = new Banque();

        // Création des clients
        Client client1 = new Client("Pedro", "Geneve");
        Client client2 = new Client("Alexandra", "Lausanne");

        // Ajout de comptes pour chaque client
        banque.ajouterCompte(client1, new ComptePrive(1000.0));
        banque.ajouterCompte(client1, new CompteEpargne(2000.0));
        banque.ajouterCompte(client2, new ComptePrive(3000.0));
        banque.ajouterCompte(client2, new CompteEpargne(4000.0));

        // Affichage des données avant le bouclage des comptes
        System.out.println("Données avant le bouclage des comptes :");
        banque.afficherComptes();

        // Bouclage des comptes (ajout des intérêts)
        banque.bouclerComptes();

        // Affichage des données après le bouclage des comptes
        System.out.println("\nDonnées après le bouclage des comptes :");
        banque.afficherComptes();
    }
}
