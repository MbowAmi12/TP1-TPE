class Note {
    private Eleve eleve;
    private Cours cours;
    private double valeur;

    public Note(Eleve eleve, Cours cours, double valeur) {
        this.eleve = eleve;
        this.cours = cours;
        this.valeur = valeur;
    }

    s
    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "Élève: " + eleve.getNom() + " " + eleve.getPrenom() + ", Cours: " + cours.getIntitule() +
               ", Note: " + valeur;
    }
}

