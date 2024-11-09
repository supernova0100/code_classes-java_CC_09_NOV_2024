abstract class Compte {
    protected double solde;

    public Compte(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public abstract void appliquerInteret();

    public void afficherSolde() {
        System.out.println("  Solde : " + solde + " francs");
    }
}
