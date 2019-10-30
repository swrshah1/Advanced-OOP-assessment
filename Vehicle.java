
/**
 * Superclass that stores common attributes of Vehicles
 * belonging to TaxiCo.
 *
 * @Swapnil Shah
 * @version 2018.12.05
 */
public class Vehicle
{
    // A unique ID for this Vehicle.
    private String ident;
    // The location of this Vehicle.
    private String location;
    // The destination of this Vehicle.
    private String destination;

    /**
     * Constructor for objects of class Vehicle
     * @param base the base of the TaxiCo
     * @param id the unique id of the vehicle.
     */
    public Vehicle(String base, String id)
    {
        ident = id;
        location = base;
        destination = null;
    }

    /**
     * Return the ID of the Vehicle.
     * @return The ID of the Vehicle.
     */
    public String getIdent()
    {
        return ident;
    }

    /**
     * Return the destination of the Vehicle.
     * @return The destination of the Vehicle.
     */
    public String getDestination()
    {
        return destination;
    }

    /**
     * Set the intented destination of the Vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    /**
     * Return the location of the Vehicle.
     * @return The location of the Vehicle.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Sets the current location of the vehicle
     * @param location the current location
     */
    public void setLocation(String location)
    {
        this.location = location;

    }

    /**
     * Return the status of this Vehicle.
     * @return The status.
     */
    public String getStatus()
    { 
        if(getDestination() == null) {
            return ident + " at " + location + " currently free";
        }

        else {
            return ident + " at " + getLocation() + " headed for "+ getDestination();

        }
    }
}
