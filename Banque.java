import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Banque {
    private Map<Client, List<Compte>> comptesClients;

    public Banque() {
        comptesClients = new HashMap<>();
    }

    public void ajouterCompte(Client client, Compte compte) {
        comptesClients.computeIfAbsent(client, k -> new ArrayList<>()).add(compte);
    }

    public void bouclerComptes() {
        for (List<Compte> comptes : comptesClients.values()) {
            for (Compte compte : comptes) {
                compte.appliquerInteret();
            }
        }
    }

    public void afficherComptes() {
        for (Map.Entry<Client, List<Compte>> entry : comptesClients.entrySet()) {
            Client client = entry.getKey();
            List<Compte> comptes = entry.getValue();

            System.out.println("Client " + client.getNom() + " de " + client.getVille());
            for (Compte compte : comptes) {
                compte.afficherSolde();
            }
        }
    }
}
