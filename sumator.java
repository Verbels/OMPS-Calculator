import java.util.Vector;

/**
 * Created by Werbel on 2014-12-04.
 */


public class sumator {
    private liczba wynik;

    public sumator()
    {
        wynik = new liczba(0);
    }
    public liczba sumuj(Vector<liczba> suma){
        this.wynik.setwartosc(0);

        for(liczba element : suma){
            wynik.setwartosc(wynik.getwartosc() + element.getwartosc());
        }

        return wynik;
    }

    public liczba iloczyn(Vector<liczba> suma){
        this.wynik.setwartosc(1);

        for(liczba element : suma){
            wynik.setwartosc(wynik.getwartosc() * element.getwartosc());
        }

        return wynik;
    }

}
