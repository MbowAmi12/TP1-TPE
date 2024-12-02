class Personne {
   private  String nom;
    private String prenom;
   private String dateNaissance;


    public  Personne(String nom, String prenom, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    
    }
     

    public void afficher() {
        System.out.println(nom + " " + prenom + " né le " + dateNaissance + " )");
    }

}
