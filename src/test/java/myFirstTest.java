import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class myFirstTest {
    private Calc objcalc;

    @Before
    public void setUp()
    {
        objcalc = new Calc();
    }
    @Test
    public void AddPass()
    {
        int a=10;
        int b=10;
        int lookingfor = 20;
        long result = objcalc.add(a,b);
        Assert.assertEquals(lookingfor,result);
    }
    @Test
    public void SubPass()
    {
        int a=10;
        int b=10;
        int lookingfor = 0;
        long result = objcalc.sub(a,b);
        Assert.assertEquals(lookingfor,result);
    }
    @Test
    public void MulPass()
    {
        int a=10;
        int b=10;
        int lookingfor = 100;
        long result = objcalc.mul(a,b);
        Assert.assertEquals(lookingfor,result);
    }
    @Test
    public void DivFail()
    {
        int a=10;
        int b=10;
        int lookingfor = 100;
        double result = objcalc.div(a,b);
        Assert.assertEquals(lookingfor,result,0.00005);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 15;
        int b = 0;
        objcalc.div(a, b);
    }
}