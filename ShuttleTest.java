import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * The test class ShuttleTest.
 * NB: There is no significant level of testing in
 * this class. This is purely a convenience class.
 *
 * @author  David J. Barnes
 * @version 2018.11.14
 */
public class ShuttleTest
{
    private Shuttle shuttle;
    private ArrayList<String> route;
    
    /**
     * Default constructor for test class ShuttleTest
     */
    public ShuttleTest()
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
        String[] destinations = {
                "Canterbury West",
                "Canterbury East",
                "The University",
                "Whitstable",
                "Herne Bay",
                "Sainsbury's",
                "Darwin",
                "Keynes",
        };
        ArrayList<String> possibles = new ArrayList<>(
                Arrays.asList(destinations));
        Random rand = new Random();
        int numDestinations = 3;
        route = new ArrayList<>();
        for(int d = 0; d < numDestinations; d++) {
            route.add(possibles.remove(rand.nextInt(possibles.size())));
        }
        
        shuttle = new Shuttle("Shuttle #1", new ArrayList<String>(route));
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
    public void testLocation()
    {
        assertEquals(route.get(0), shuttle.getLocation());
    }

    @Test
    public void testDestination()
    {
        assertEquals(route.get(1), shuttle.getDestination());
    }

    @Test
    public void testArrival()
    {
        assertEquals(route.get(1), shuttle.getDestination());
        shuttle.signalArrival();
        assertEquals(route.get(1), shuttle.getLocation());
        assertEquals(route.get(2), shuttle.getDestination());
    }

    @Test
    public void testID()
    {
        assertEquals("Shuttle #1", shuttle.getIdent());
    }

    @Test
    public void testStatus()
    {
        assertEquals("Shuttle #1 at " + route.get(0) + 
            " headed for " + route.get(1), shuttle.getStatus());
    }
}




