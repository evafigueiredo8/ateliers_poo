import java.util.GregorianCalendar;

class TestPersonne{
    public static void main(String[] args){
        GregorianCalendar date1 = new GregorianCalendar(2008,10,8);
        Adresse adresse1 = new Adresse(13,"Rue de la Seranne","34380","Causse de la Selle");
        Personne personne1 = new Personne("Figueiredo","Eva", date1, adresse1);
        Personne personne2 = new Personne("Figueiredo","Olivia", 8, 12, 2005, 13, "Rue de la Seranne", "34380", "Causse de la Selle");
        Personne personne3 = new Personne("Figueiredo","Eva", date1, adresse1);
        System.out.println(personne1.plusAgee(personne2));
        System.out.println(personne1.plusAgeeQue(personne2));
        System.out.println(personne1.Equals(personne3));
    }
}