import java.util.*;

public class DePipe extends De{
    int valeurMin;
    private static Random r = new Random();

    public DePipe(int vmin){
        valeurMin = vmin;
    }

    public int lancer(){
        int nbAleatoire= r.nextInt(nbFaces) + valeurMin;
        return nbAleatoire;
    }

    public String toString(){
        int lancer = lancer();
        return nom + ", " + nbFaces + ", " + nbDe + ", " + lancer;
    }

}