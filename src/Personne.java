public class Personne {

    private String nom;
    private String prenom;

    public Personne (String unPrenom, String unNom) {
        nom = unNom;
        prenom = unPrenom;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }

}