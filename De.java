import java.util.*;

public class De{
    String nom;
    int nbFaces;
    private static Random r = new Random();
    static int nbDe;
    static int meilleurLancer;

    public De(String nom, int nbFaces){
        if((nbFaces<120) && (nbFaces>3)){
            this.nbFaces = nbFaces;
            this.nom = nom;
            nbDe+=1;
        } else{
            System.err.println(nbFaces);
        }
    }

    public De(String nom){
        this.nom = nom;
        this.nbFaces = 6;
        nbDe+=1;
    }

    public De(int nbFaces){
        if((nbFaces<120) && (nbFaces>3)){
            this.nbFaces = nbFaces;
            this.nom = "De" + nbDe;
            nbDe+=1;
        } else{
            System.err.println(nbFaces);
        }
    }

    public De(){
        this.nom = "De" + nbDe;
        this.nbFaces = 6;
        nbDe+=1;
    }

    public void getNbFaces(){
        System.out.println("Le dé possède " + nbFaces + " faces.");
    }

    public void setNbFaces(int nbFaces){
        if((nbFaces<120) && (nbFaces>3)){
            this.nbFaces = nbFaces;
        } else{
            System.err.println(nbFaces);
        }
    }

    public void getNom(){
        System.out.println("Le nom du dé est " + nom + ".");
    }

    public int lancer(){
        int nbAleatoire= r.nextInt(nbFaces)+1;
        return nbAleatoire;
    }

    public void getNbDe(){
        System.out.println("Il existe " + nbDe + "dé(s).");
    }

    public int nvlancer(int nblancer){
        int i = 0;
        meilleurLancer = 0;
        while (i<nblancer){
            int lancer = lancer();
            if (lancer>meilleurLancer){
                meilleurLancer = lancer;
            }
        }
        return meilleurLancer;
    }

}