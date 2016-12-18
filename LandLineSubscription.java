
/**
 * Concrete class for a landline phone subscription
 * 
 * @author Daniel Long
 * @version 1.1
 */
public class LandLineSubscription extends PhoneSubscription implements HasAddress
{
    // instance variables - replace the example below with your own
    private String address; // Address of the subscriber must be entered here
    /**
     * Constructor for objects of class LandLineSubscription.
     * Creates a landLineSubscription object with a phoneNumber
     * 
     * @param   PhoneNumber - unique phone number for subscriber
     */
    public LandLineSubscription(String subscriber, String phoneNumber, String address)
    {
        // initialise instance variables
        super(subscriber,"Landline telephone",1800,phoneNumber);
        this.address = address;
    }

    /**
     * Getter method to return the address of the subscriber
     * 
     * @return     String containing address of the subscriber
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * Method to compute the total charge for a subscriber per billing period
     * Calculate as the product of 2 and the total number of minutes called over a billing period
     * 
     * @return   int containing the value of bill for the subscriber
     */
    @Override
    public int computeTotalChargeInPence()
    {
        return getStandingChargeInPence()+(this.getCallMinutes()*2);
    }
}
