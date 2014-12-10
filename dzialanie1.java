/**
 * Created by Werbel on 2014-12-04.
 */
import static java.lang.Math.*;

public class dzialanie1 {
    private liczba wart1;
    private String znak;
    private liczba wynik;

    public dzialanie1(){
        wynik = new liczba();
    }

    public liczba kwadrat(liczba a) {
        this.wynik.setwartosc(a.getwartosc() * a.getwartosc());
        return wynik;
    }

    public liczba szescian(liczba a) {
        this.wynik.setwartosc(a.getwartosc() * a.getwartosc() * a.getwartosc());
        return wynik;
    }

    public liczba pierwiastek(liczba a) {
        float x=(a.getwartosc());
        double d=sqrt(x);
        Float f= Float.valueOf(String.valueOf(d));
       this.wynik.setwartosc(f);
        //this.wynik.setwartosc(sqrt((a.getwartosc())));
        return wynik;
    }

}
