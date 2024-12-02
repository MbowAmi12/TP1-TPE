public class Text{
        
         public static void main(String[] args) {
        Eleve eleve1 = new Eleve(1, "Mbow", "Amina", "2003-12-23", "Groupe A");
        Professeur professeur1 = new Professeur("mbaye", "Abdoulaye", "1970-05-12", "Informatique");

        
        eleve1.afficherEleve();
        professeur1.afficherProfesseur();
    
     System.out.println("la gestion accademimique operationnel.");
}
}