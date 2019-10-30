

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TaxiTest.
 * NB: There is no significant level of testing in
 * this class. This is purely a convenience class.
 *
 * @author  David J. Barnes
 * @version 2018.11.14
 */
public class TaxiTest
{
    private Taxi taxi1;

    /**
     * Default constructor for test class TaxiTest
     */
    public TaxiTest()
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
        taxi1 = new Taxi("base", "Car #1");
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
    public void testIdent()
    {
        assertEquals("Car #1", taxi1.getIdent());
    }

    @Test
    public void testInitialState()
    {
        assertEquals("base", taxi1.getLocation());
        assertEquals(null, taxi1.getDestination());
    }

    @Test
    public void testSetDestination()
    {
        assertEquals("base", taxi1.getLocation());
        taxi1.setDestination("The Venue");
        assertEquals("The Venue", taxi1.getDestination());
    }

    @Test
    public void testArrival()
    {
        assertEquals("base", taxi1.getLocation());
        assertEquals(null, taxi1.getDestination());
        taxi1.setDestination("The Venue");
        taxi1.signalArrival();
        assertEquals("The Venue", taxi1.getLocation());
        assertEquals(null, taxi1.getDestination());
    }
}




