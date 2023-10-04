import java.util.*;

public class De{
    String nom;
    int nbFaces;
    private static Random r = new Random();
    static int nbDe;
    int meilleurLancer;

    public De(String nom, int nbFaces){
        if((nbFaces<120) && (nbFaces>3)){
            this.nbFaces = nbFaces;
            this.nom = nom;
            nbDe+=1;
        } else{
            System.err.println(nbFaces);
            this.nbFaces = 6;
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
            nbDe+=1;
            this.nom = "De" + nbDe;
        } else{
            System.err.println(nbFaces);
            this.nbFaces = 6;
        }
    }

    public De(){
        nbDe+=1;
        this.nom = "De" + nbDe;
        this.nbFaces = 6;
    }

    public void getNbFaces(){
        System.out.println("Le dé possède " + nbFaces + " faces.");
    }

    public void setNbFaces(int nbFaces){
        if((nbFaces<120) && (nbFaces>3)){
            this.nbFaces = nbFaces;
        } else{
            System.err.println(nbFaces);
            this.nbFaces = 6;
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
            i+=1;
        }
        return meilleurLancer;
    }

    public String toString(){
        int meilleurLancer = nvlancer(5);
        return nom + ", " + nbFaces + ", " + nbDe + ", " + meilleurLancer;
    }

    /*public boolean equals(){
        }*/

} 