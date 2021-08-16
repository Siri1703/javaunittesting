import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class arithmetictest {
    @Test
    public void addTwoPositiveNumbers()
    {
        Arithmeticadd aobj=new Arithmeticadd(2,3);
        int expectedresult=5;
        int actualresult=aobj.sum();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void addTwoNegativeNumbers()
    {
        Arithmeticadd aobj=new Arithmeticadd(-3,-5);
        int expectedresult=-8;
        int actualresult=aobj.sum();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void addOnePostiveandOneNegativeNumber()
    {
        Arithmeticadd aobj=new Arithmeticadd(-3,5);
        int expectedresult=2;
        int actualresult=aobj.sum();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void addOneZeroandOnePositiveNumber()
    {
        Arithmeticadd aobj=new Arithmeticadd(0,7);
        int expectedresult=7;
        int actualresult=aobj.sum();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractTwoPositiveNumbers()
    {
        Arithmeticadd aobj=new Arithmeticadd(2,3);
        int expectedresult=-1;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractTwoNegativeNumbers()
    {
        Arithmeticadd aobj=new Arithmeticadd(-3,-5);
        int expectedresult=2;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractOnePostiveandOneNegativeNumber()
    {
        Arithmeticadd aobj=new Arithmeticadd(-3,5);
        int expectedresult=-8;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractOneZeroandOnePositiveNumber()
    {
        Arithmeticadd aobj=new Arithmeticadd(0,7);
        int expectedresult=-7;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractOnePositiveandOneZeroNumber()
    {
        Arithmeticadd aobj=new Arithmeticadd(10,0);
        int expectedresult=10;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void multiplyOnePositiveandOneZeroNumber()
    {
        Arithmeticadd aobj=new Arithmeticadd(10,0);
        int expectedresult=0;
        int actualresult=aobj.multiply();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractOnePositiveandOneNegativeNumber()
    {
        Arithmeticadd aobj=new Arithmeticadd(10,-2);
        int expectedresult=-20;
        int actualresult=aobj.multiply();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void multiplyTwoPositiveNumbers()
    {
        Arithmeticadd aobj=new Arithmeticadd(10,9);
        int expectedresult=90;
        int actualresult=aobj.multiply();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void multiplyTwoNegativeNumbers()
    {
        Arithmeticadd aobj=new Arithmeticadd(-10,-4);
        int expectedresult=40;
        int actualresult=aobj.multiply();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void DivisionOnePositiveandOneNegativeNumber()
    {
        Arithmeticadd aobj=new Arithmeticadd(-8,3);
        int expectedresult=-2;
        int actualresult=aobj.division();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void DivisionTwoPositiveNumbers()
    {
        Arithmeticadd aobj=new Arithmeticadd(9,2);
        int expectedresult=1;
        int actualresult=aobj.division();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void DivisionOnePositiveNumberandOneZero()
    {
        Arithmeticadd aobj=new Arithmeticadd(9,0);
        Exception exception=assertThrows(ArithmeticException.class,()->aobj.division());
        assertEquals(exception.getMessage(),"/ by zero");
    }
    @Test
    public void DivisionTwonegativeNumbers()
    {
        Arithmeticadd aobj=new Arithmeticadd(-9,-4);
        int expectedresult=-1;
        int actualresult=aobj.division();
        assertEquals(expectedresult,actualresult);
    }






}
