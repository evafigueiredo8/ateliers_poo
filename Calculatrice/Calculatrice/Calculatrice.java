package Calculatrice;

public class Calculatrice extends Affichage implements Operations{

    @Override
    public Object addition(Object obj1, Object obj2) {
        return (Integer) obj1 + (Integer) obj2;
    }
    
    @Override
    public Object soustraction(Object obj1, Object obj2) {
        return (Integer) obj1 - (Integer) obj2;
    }

    @Override
    public Object multiplication(Object obj1, Object obj2) {
        return (Integer) obj1 * (Integer) obj2;
    }

    @Override
    public Object division(Object obj1, Object obj2) {
        if (((Integer) obj1 < 1) || ((Integer) obj2 < 1)){
            return null;
        }
        return (Integer) obj1 / (Integer) obj2;
    }

    @Override
    public void afficher(Object obj) {
        System.out.println((Integer)obj);
    }
}
