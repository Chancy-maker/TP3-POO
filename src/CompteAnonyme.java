public class CompteAnonyme {
    static private int nombreDeComptesCrres = 0;
    static int nombreDeCompteUtilises = 0;
    private int numero;
    private float solde;
    private final String debutTexteErreur = "Erreur";

    public CompteAnonyme(float solde){
        this.solde = solde;
        nombreDeComptesCrres ++;
        this.numero = nombreDeComptesCrres;
    }

    public CompteAnonyme(){
        this(0);
    }

    public float getSolde() {
        return solde;
    }
    public int getNumero(){
        return  numero;
    }

    public boolean depot(float f){
        if(f>0){
            solde += f;
            return true;
        }
        return false;
    }

    public void retrait (float f){
        if (f<=solde){
            solde -= f;
        }
    }

    public static void virement(CompteAnonyme c1, CompteAnonyme c2, float f ){
        if( f <= c1.getSolde()){
            c1.retrait(f);
            c2.depot(f);
        }
    }

}
