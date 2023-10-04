public class CreerEntier{
    private int valeur;
    private int borneMin;
    private int borneMax;

    public CreerEntier(int borneMin, int borneMax, int valeur){
        this.borneMin = borneMin;
        this.borneMax = borneMax;
        if ((valeur>borneMin) && (valeur>borneMax)){
            this.valeur = valeur;
        }
    }

    public CreerEntier(int borneMin, int borneMax){
        valeur = 0;
    }

    public void getbornes(){
        System.out.println(borneMin + ", " + borneMax);
    }

    public void setvaleur(int valeur){
        if ((valeur>borneMin) && (valeur>borneMax)){
            this.valeur = valeur;
        }
    }
}