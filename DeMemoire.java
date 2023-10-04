import java.util.*;

public class DeMemoire extends De{
    private static Random r = new Random();
    static int nbLancer;
    int nbAleatoire;

    public int lancer(){
        do {
            nbAleatoire = r.nextInt(nbFaces) + 1;
        } while (nbAleatoire == nbLancer);
        nbLancer = nbAleatoire;
        return nbLancer;
    }

    public String toString(){
        int lancer = lancer();
        return nom + ", " + nbFaces + ", " + nbDe + ", " + lancer;
    }

}