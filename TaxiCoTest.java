import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TaxiCoTest.
 * NB: There is no significant level of testing in
 * this class. This is purely a convenience class.
 *
 * @author  David J. Barnes
 * @version 2018.11.14
 */
public class TaxiCoTest
{
    private TaxiCo taxiCo1;

    /**
     * Default constructor for test class TaxiCoTest
     */
    public TaxiCoTest()
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
        taxiCo1 = new TaxiCo("djb's cars");
        taxiCo1.addTaxi();
        taxiCo1.addTaxi();
        //taxiCo1.addShuttle();
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

    /**
     * Test whether we can book a taxi.
     */
    @Test
    public void testBook()
    {
        Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
        assertNotNull(taxi1);
        taxi1.book("ASDA");
        assertEquals("ASDA", taxi1.getDestination());
    }

    /**
     * Test the status of a taxi after it has arrived.
     */
    @Test
    public void testArrived()
    {
        Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
        assertNotNull(taxi1);
        taxi1.book("ASDA");
        taxi1.signalArrival();
        assertNull(taxi1.getDestination());
        assertEquals("ASDA", taxi1.getLocation());
    }
}

