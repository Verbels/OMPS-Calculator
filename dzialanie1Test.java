import org.junit.Assert;

public class dzialanie1Test {
    dzialanie1 dzialanie1;
    liczba liczba;


    public void setUp() throws Exception {
        dzialanie1 = new dzialanie1();
        liczba = new liczba();
        liczba.setwartosc(4);
    }


    public void tearDown() throws Exception {

    }


    public void testKwadrat() throws Exception {
        liczba wynik = new liczba();
        wynik.setwartosc(16);
        Assert.assertEquals(dzialanie1.kwadrat(liczba).getwartosc(), wynik.getwartosc(), 0);
    }


    public void testSzescian() throws Exception {
        liczba wynik = new liczba();
        wynik.setwartosc(64);
        Assert.assertEquals(dzialanie1.szescian(liczba).getwartosc(), wynik.getwartosc(), 0);
    }


    public void testPierwiastek() throws Exception {
        liczba wynik = new liczba();
        wynik.setwartosc(2);
        Assert.assertEquals(dzialanie1.pierwiastek(liczba).getwartosc(), wynik.getwartosc(), 0);
    }
}