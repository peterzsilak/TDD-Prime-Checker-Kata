import org.junit.Before;
import org.junit.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PrimeTest {

    private Prime prime;

    @Before
    public void setup(){
         prime = new Prime();
    }

    @Test
    public void isOnePrim(){
        boolean result = prime.isThisNumberPrime(1);
        assertThat(result, is(FALSE));
    }

    @Test
    public void isTwoPrim(){
        boolean result = prime.isThisNumberPrime(2);
        assertThat(result, is(TRUE));
    }

    @Test
    public void isThreePrim(){
        boolean result = prime.isThisNumberPrime(3);
        assertThat(result, is(TRUE));
    }

    @Test
    public void isFourPrim(){
        boolean result = prime.isThisNumberPrime(4);
        assertThat(result, is(FALSE));
    }

    @Test
    public void isSeventyOnePrim(){
        boolean result = prime.isThisNumberPrime(71);
        assertThat(result, is(TRUE));
    }

    @Test
    public void isNinePrim(){
        boolean result = prime.isThisNumberPrime(9);
        assertThat(result, is(FALSE));
    }

    @Test
    public void isNullPrim(){
        boolean result = prime.isThisNumberPrime(0);
        assertThat(result, is(FALSE));
    }

    @Test
    public void isMinusOnePrim(){
        boolean result = prime.isThisNumberPrime(-1);
        assertThat(result, is(FALSE));
    }

    @Test
    public void isOneThousandEightyPrim(){
        boolean result = prime.isThisNumberPrime(1980);
        assertThat(result, is(FALSE));
    }
}
