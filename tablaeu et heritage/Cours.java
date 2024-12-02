class Cours {
    private int idCours;
    private String intitule;
    private int coefficient;
    private Professeur professeurResponsable;

    public Cours(int idCours, String intitule, int coefficient, Professeur professeurResponsable) {
        this.idCours = idCours;
        this.intitule = intitule;
        this.coefficient = coefficient;
        this.professeurResponsable = professeurResponsable;
    }


    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public Professeur getProfesseurResponsable() {
        return professeurResponsable;
    }

    public void setProfesseurResponsable(Professeur professeurResponsable) {
        this.professeurResponsable = professeurResponsable;
    }

    @Override
    public String toString() {
        return "ID Cours: " + idCours + ", Intitulé: " + intitule + ", Coefficient: " + coefficient +
               ", Professeur: " + professeurResponsable.getNom() + " " + professeurResponsable.getPrenom();
    }
}










