public class CreerEntier{
    private int valeur;

    public CreerEntier(int borneMin, int borneMax, int valeur){
        if (valeur>borneMin) && (valeur>borneMax){
            this.valeur = valeur;
        }
    }
}