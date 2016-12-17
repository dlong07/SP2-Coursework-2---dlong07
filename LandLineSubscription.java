
/**
 * Concrete class for a landline phone subscription
 * 
 * @author Daniel Long
 * @version 1.1
 */
public class LandLineSubscription extends PhoneSubscription implements HasAddress
{
    // instance variables - replace the example below with your own
    private String address;
    /**
     * Constructor for objects of class LandLineSubscription.
     * Creates a landLineSubscription object with a phoneNumber
     * 
     * @param PhoneNumber - unique phone number for subscriber
     */
    public LandLineSubscription(String PhoneNumber)
    {
        // initialise instance variables
        super("");
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Method to return the address 
     * 
     * @return     String containing address of the subscriber
     */
    public String getAddress()
    {
        // put your code here
        return address;
    }
    /**
     * Method to compute the total charge for a subscriber per billing period
     * 
     * @return int containing the value of bill for the subscriber
     */
    @Override
    public int computeTotalChargeInPence()
    {
        return 1;
    }
}
