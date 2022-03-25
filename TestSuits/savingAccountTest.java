import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class savingAccountTest {

        static savingAccount s;

        @BeforeClass
        public static void setUp() throws IllegalArgumentException {
            s= new savingAccount();
            System.out.println("from setUp");

        }


        @Test(expected = IllegalArgumentException.class)
        public void calculatingInvestUnderZero(){
            double actual = s.CalculatingInvest(-0.01);
            assertEquals(3,actual,0.00);
        }




    @Test
    public void calculatingInvestForZero() {
        double actual = s.CalculatingInvest(0.00);
        assertEquals(0.00,actual,0.00);

    }

    @Test
    public void calculatingInvestFor100() {
        double actual = s.CalculatingInvest(100.00);
        assertEquals(103.00,actual,100.00);

    }

    @Test
    public void calculatingInvestFor50() {
        double actual = s.CalculatingInvest(50.00);
        assertEquals(51.50,actual,1.50);

    }

    @Test
    public void calculatingInvestFor100Point01() {
        double actual = s.CalculatingInvest(100.01);
        assertEquals(105.0105,actual,5.0005);

    }
    @Test
    public void calculatingInvestFor300() {
        double actual = s.CalculatingInvest(300.00);
        assertEquals(315.00,actual,300.00);

    }

    @Test
    public void calculatingInvestFor999Point99() {
        double actual = s.CalculatingInvest(999.99);
        assertEquals(1049.9895,actual,49.9995);

    }


    @Test
    public void calculatingInvestFor1000() {
        double actual = s.CalculatingInvest(1000.00);
        assertEquals(1070.00,actual,1000);

    }


    @Test
    public void calculatingInvestFor1200() {
        double actual = s.CalculatingInvest(1200.00);
        assertEquals(1084.00,actual,1200.00);

    }


}