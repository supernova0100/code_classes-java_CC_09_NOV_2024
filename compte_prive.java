class ComptePrive extends Compte {
    private static final double TAUX_INTERET = 0.01;

    public ComptePrive(double solde) {
        super(solde);
    }

    @Override
    public void appliquerInteret() {
        solde += solde * TAUX_INTERET;
    }

    @Override
    public void afficherSolde() {
        System.out.println("  Compte privé : " + solde + " francs");
    }
}
