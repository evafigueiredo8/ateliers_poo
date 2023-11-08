package Vehicules;

public class Automobile{
    String modèle;
    int puissance;
    String couleur;
    float espace;

    public void afficherCaractéristiques(){
        System.out.println("Modèle : " + modèle + ", Puissance : " + this.puissance + 
        "Couleur : " + this.couleur + ", Espace : " + this.espace);
    }
}