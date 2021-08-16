import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class arithmetictest {
    @Test
    public void addTwoPositiveNumbers()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(2,3);
        int expectedresult=5;
        int actualresult=aobj.sum();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void addTwoNegativeNumbers()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(-3,-5);
        int expectedresult=-8;
        int actualresult=aobj.sum();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void addOnePostiveandOneNegativeNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(-3,5);
        int expectedresult=2;
        int actualresult=aobj.sum();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void addOneZeroandOnePositiveNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(0,7);
        int expectedresult=7;
        int actualresult=aobj.sum();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractTwoPositiveNumbers()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(2,3);
        int expectedresult=-1;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractTwoNegativeNumbers()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(-3,-5);
        int expectedresult=2;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractOnePostiveandOneNegativeNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(-3,5);
        int expectedresult=-8;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractOneZeroandOnePositiveNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(0,7);
        int expectedresult=-7;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractOnePositiveandOneZeroNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(10,0);
        int expectedresult=10;
        int actualresult=aobj.sub();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void multiplyOnePositiveandOneZeroNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(10,0);
        int expectedresult=0;
        int actualresult=aobj.multiply();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void subtractOnePositiveandOneNegativeNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(10,-2);
        int expectedresult=-20;
        int actualresult=aobj.multiply();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void multiplyTwoPositiveNumbers()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(10,9);
        int expectedresult=90;
        int actualresult=aobj.multiply();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void multiplyTwoNegativeNumbers()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(-10,-4);
        int expectedresult=40;
        int actualresult=aobj.multiply();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void DivisionOnePositiveandOneNegativeNumber()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(-8,3);
        int expectedresult=-2;
        int actualresult=aobj.division();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void DivisionTwoPositiveNumbers()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(9,2);
        int expectedresult=1;
        int actualresult=aobj.division();
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void DivisionOnePositiveNumberandOneZero()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(9,0);
        Exception exception=assertThrows(ArithmeticException.class,()->aobj.division());
        assertEquals(exception.getMessage(),"/ by zero");
    }
    @Test
    public void DivisionTwonegativeNumbers()
    {
        Arithmeticoperations aobj=new Arithmeticoperations(-9,-4);
        int expectedresult=-1;
        int actualresult=aobj.division();
        assertEquals(expectedresult,actualresult);
    }






}
