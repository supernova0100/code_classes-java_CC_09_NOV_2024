class CompteEpargne extends Compte {
    private static final double TAUX_INTERET = 0.02;

    public CompteEpargne(double solde) {
        super(solde);
    }

    @Override
    public void appliquerInteret() {
        solde += solde * TAUX_INTERET;
    }

    @Override
    public void afficherSolde() {
        System.out.println("  Compte d'épargne : " + solde + " francs");
    }
}
