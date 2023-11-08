package Calculatrice;

public class CalculatriceReel extends Affichage implements Operations{

    @Override
    public Object addition(Object obj1, Object obj2) {
        return (Double) obj1 + (Double) obj2;
    }
    
    @Override
    public Object soustraction(Object obj1, Object obj2) {
        return (Double) obj1 - (Double) obj2;
    }

    @Override
    public Object multiplication(Object obj1, Object obj2) {
        return (Double) obj1 * (Double) obj2;
    }

    @Override
    public Object division(Object obj1, Object obj2) {
        if (((Double) obj1 < 1) || ((Double) obj2 < 1)){
            return null;
        }
        return (Double) obj1 / (Double) obj2;
    }

    @Override
    public void afficher(Object obj) {
        System.out.println((Double)obj);
    }
    
}
