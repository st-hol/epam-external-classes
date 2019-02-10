package ua.training.calculator;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class ArithmeticsTest {

    private static  Arithmetics a;

    @Rule
    public final ExpectedException exc = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void run(){
        a = new Arithmetics();
    }

    @Test
    public void add() {
        double result = a.add(3, 7);
        if (result != 10.0){
            Assert.fail();
        }
    }

    @Ignore
    @Test
    public void deduct() {
        double result = a.deduct(3, 7);
        Assert.assertEquals(result, -4.0, 0.1);
        Assert.assertNotNull(a);
    }

    @Test
    public void mult() {
        double result = a.mult(3, 7);
        Assert.assertTrue(result == 21.0);
    }

    @Test
    public void div() {
        double result = a.div(3.0, 7.0);
        Assert.assertFalse("It's really false", result == 0.4);
    }


    //@Test(expected = ArithmeticException.class)
    @Test
    public void divByZero(){
        exc.expect(ArithmeticException.class);
        a.div(10,0); //calls overloaded method for int
    }

    @Test
    public void causeTimeout(){
        while (true){}
    }
}