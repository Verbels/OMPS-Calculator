import junit.framework.TestCase;
import org.junit.Assert;

public class dzialanie2Test extends TestCase {

    dzialanie2 dzialanie2;
    liczba liczba1;
    liczba liczba2;

    public void setUp() throws Exception {
        super.setUp();
        dzialanie2 = new dzialanie2();
        liczba1 = new liczba();
        liczba2 = new liczba();
        liczba1.setwartosc(6);
        liczba2.setwartosc(3);
    }

    public void testDodawanie(){
        liczba wynik = new liczba();
        wynik.setwartosc(9);
        Assert.assertEquals(dzialanie2.dodawanie(liczba1, liczba2).getwartosc(), wynik.getwartosc(), 0);
        wynik.setwartosc(9);
        Assert.assertEquals(dzialanie2.dodawanie(liczba2, liczba1).getwartosc(), wynik.getwartosc(), 0);
    }

    public void testOdejmowanie(){
        liczba wynik = new liczba();
        wynik.setwartosc(3);
        Assert.assertEquals(dzialanie2.odejmowanie(liczba1, liczba2).getwartosc(), wynik.getwartosc(), 0);
        wynik.setwartosc(-3);
        Assert.assertEquals(dzialanie2.odejmowanie(liczba2, liczba1).getwartosc(), wynik.getwartosc(), 0);
    }

    public void testMnozenie(){
        liczba wynik = new liczba();
        wynik.setwartosc(18);
        Assert.assertEquals(dzialanie2.mnozenie(liczba1, liczba2).getwartosc(), wynik.getwartosc(), 0);
        wynik.setwartosc(18);
        Assert.assertEquals(dzialanie2.mnozenie(liczba2, liczba1).getwartosc(), wynik.getwartosc(), 0);
    }

    public void testDzielenie(){
        liczba wynik = new liczba();
        wynik.setwartosc(2);
        Assert.assertEquals(dzialanie2.dzielenie(liczba1, liczba2).getwartosc(), wynik.getwartosc(), 0);
        wynik.setwartosc(0.5f);
        Assert.assertEquals(dzialanie2.dzielenie(liczba2, liczba1).getwartosc(), wynik.getwartosc(), 0);
    }

    public void testModulo(){
        liczba wynik = new liczba();
        wynik.setwartosc(0);
        Assert.assertEquals(dzialanie2.modulo(liczba1, liczba2).getwartosc(), wynik.getwartosc(), 0);
        wynik.setwartosc(3);
        Assert.assertEquals(dzialanie2.modulo(liczba2, liczba1).getwartosc(), wynik.getwartosc(), 0);
    }
}