import java.util.*;

public class DeMemoire extends De{
    private static Random r = new Random();
    int ancienLance;

    public int lancer(){
        int nvLance;
        do {
            nvLance = super.lancer();
        } while (nvLance == ancienLance);
        ancienLance = nvLance;
        return ancienLance;
    }

    public String toString(){
        return nom + ", " + nbFaces + ", " + nbDe + ", " + lancer();
    }

}