/**
 * Created by Werbel on 2014-12-04.
 http://joemonster.org/filmy/65521/BREAKING_BAD_This_is_my_product_*/
public class dzialanie2 {
    private liczba wart1;
    private liczba wart2;
    private String znak;
    private liczba wynik;

    public dzialanie2(){
        wynik = new liczba();
    }

    public liczba dodawanie(liczba a, liczba b){
        this.wynik.setwartosc(a.getwartosc() + b.getwartosc());
        return wynik;
    }

    public liczba odejmowanie(liczba a, liczba b){
        this.wynik.setwartosc(a.getwartosc() - b.getwartosc());
        return wynik;
    }

    public liczba mnozenie(liczba a, liczba b){
        this.wynik.setwartosc(a.getwartosc() * b.getwartosc());
        return wynik;
    }

    public liczba dzielenie(liczba a, liczba b){
        this.wynik.setwartosc(a.getwartosc() / b.getwartosc());
        return wynik;
    }

    public liczba modulo(liczba a, liczba b){
        this.wynik.setwartosc(a.getwartosc() % b.getwartosc());
        return wynik;
    }
}
