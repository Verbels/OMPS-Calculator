import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Vector;

public class sumatorTest extends TestCase {

    private sumator sumator;
    private Vector<liczba> liczby;

    public void setUp() throws Exception {
        sumator = new sumator();
        liczby = new Vector<liczba>();
        liczby.add(new liczba(1));
        liczby.add(new liczba(2));
        liczby.add(new liczba(3));
        liczby.add(new liczba(4));
        super.setUp();

    }

    public void testSumuj() {
        Assert.assertEquals(sumator.sumuj(liczby).getwartosc(), 10f, 0);
    }

    public void testIloczyn() {
        Assert.assertEquals(sumator.iloczyn(liczby).getwartosc(), 24f, 0);
    }
}