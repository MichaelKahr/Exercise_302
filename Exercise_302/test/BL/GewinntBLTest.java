package BL;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author mikeykahr
 */
@RunWith(value = Parameterized.class)
public class GewinntBLTest {

    public GewinntBLTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Parameter(value = 0)
    public int col;

    @Parameter(value = 1)
    public Object res;

    @Parameters(name = "{index}: Input: {0} Results {1}")
    public static Iterable<Object[]> data1() {
        return Arrays.asList(new Object[][]{
            {1,5}, {-1,"Please enter a valid column"},{0,5},{2,5},{100,"Please enter a valid column"},{7,"Please enter a valid column"},{6,5}
        });
    }

    /**
     * Test of makeMove method, of class GewinntBL.
     */
    @Test
    public void testMakeMove() {
        GewinntBL instance = new GewinntBL();
        Object expResult = res;
        try {
            Object actRes = instance.makeMove(col);
            assertEquals(expResult, actRes);
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
        
    }

}
