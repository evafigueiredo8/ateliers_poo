public class TD1{

    public static void main(String[] args){

        System.out.println(addition(1,2));
        int array[] = {1,2,3};
        System.out.println(addition2(array));
        System.out.println(multiplication(5));
        System.out.println(aireCercle(5));
        System.out.println(perimetreCercle(5));
        System.out.println(moyenneTableau(array));
        System.out.println(inverserChaine("Ma chaine"));
        System.out.println(valeurAscii('A'));
    }

    public static int addition(int nb1, int nb2){
        return nb1 + nb2;
    }

    public static int addition2(int[] tableau){
        int total = 0;
        for(int i = 0; i < tableau.length; i++){
            total += tableau[i];
        }
        return total;
    }

    public static String multiplication(int nb){
        String table = "";
        for(int i = 0; i<=10; i++){
            table += (nb + " x " + i + " = " + 5 * i + "\n");
        }
        return table;
    }

    public static double aireCercle(int rayon){
        return 2*Math.PI*rayon;
    }

    public static double perimetreCercle(int rayon){
        return Math.PI*Math.pow(rayon,2);
    }

    public static double moyenneTableau(int[] tableau){
        double moyenne = 0;
        for(int i = 0; i <= tableau.length; i++){
            moyenne += i;
        }
        moyenne /= tableau.length;
        return moyenne;
    }

    public static String inverserChaine(String chaine){
        String chaineInverse = "";
        for(int i = chaine.length()-1; i >= 0; i--){
            chaineInverse += chaine.charAt(i);
        }
        return chaineInverse;
    }

    public static int valeurAscii(char caractere){
        return (int) caractere;
    }

    public static int convertirEnCelsius(int celsius){
        return 9/5*celsius+32;
    }

    public static int convertirEnFarenheit(int farenheit){
        return (farenheit+32)*5/9;
    }

    public static Boolean nbPremiers(int nb){
        Boolean premier = false;
        for(int i = 2; i <= nb; i++){
            if (%(nb,i) = 0){
                
            }
        }
        if (nb)
        return premier;
    }
}