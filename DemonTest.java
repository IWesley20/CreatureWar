

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DemonTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DemonTest
{
    /**
     * Default constructor for test class DemonTest
     */
    public DemonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGetDamage() {
         Demon demon01 = new Demon(7, 7);
         assertEquals(6, demon01.getDamage());
    }
}
