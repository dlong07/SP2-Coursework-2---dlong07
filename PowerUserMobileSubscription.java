/**
 * Concrete class for PowerUserMobileSubscription
 * 
 * @author Daniel Long
 * @version 1.1
 */
public class PowerUserMobileSubscription extends MobileSubscription implements BoundedCharge
{
    // instance variable
    private String address;
    /**
     * Constructor for objects of class PowerUserMobileSubscription
     */
    public PowerUserMobileSubscription(String address)
    {
        this.address = address;
    }

    /**
     * Overridden method from Subscriber to compute the total charge
     * for a billing period for a pay as you subscriber
     * 
     * 
     * @return  an int for the amount of the billing period in pence
     */
    @Override
    public int computeTotalChargeInPence()
    {
        return 1;
    }
    
    /**
    * Getter method taken from HasAddress interface. Used to get the address of the subscriber
    * 
    * 
    * @return String contain address of the subscriber
    */
    public String getAddress()
    {
        return this.address;
    }
    

    /**
     * A method to compute the total charge for a billing period for a pay as you subscriber
     * 
     * 
     * @return  an int for the amount of the billing period in pence
     */
    @Override
    public int getMaxChargeInPence()
    {
        return 1;
    }
}
