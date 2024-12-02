class Eleve extends Personne {
    private int matricule;
    private  String groupe;

    public Eleve(int matricule, String nom, String prenom, String dateNaissance) {
        super(nom, prenom, dateNaissance);
        this.matricule = matricule;
        this.groupe=groupe;
    }

     

    public void afficherEleve() {
        super.afficher();
        System.out.println("Matricule : " + matricule + ", Groupe : " + groupe);
    }
}