
/**
 * Concrete class for a landline phone subscription object
 * 
 * @author Daniel Long
 * @version 1.1
 */
public class LandLineSubscription extends PhoneSubscription implements HasAddress
{
    // instance variable
    private String address; // Address of the subscriber 
    /**
     * Constructor for objects of class LandLineSubscription.
     * Creates a landLineSubscription object with a phoneNumber and address
     * 
     * @param   subscriber - name of the person taking the subscription - must not be null
     * @param   phoneNumber - unique phone number for subscriber - must not be null
     * @param   address - subscriber's address - must not be null
     */
    public LandLineSubscription(String subscriber, String phoneNumber, String address)
    {
        // initialise instance variables
        super(subscriber,"Landline telephone",1800,phoneNumber); // passes subscriber, subscriptionName, standingCharge and phoneNumber params to superclass constructor
        if(address == null || address == "") // make sure that the address is not empty or null
        {
            throw new IllegalArgumentException("Address cannot be null! Please try again.");
        }
        this.address = address; // address of subscriber stored from the parameters
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
        return getStandingChargeInPence()+(getCallMinutes()*2);  // standing charge plus the number of call minutes * 2
    }
}
