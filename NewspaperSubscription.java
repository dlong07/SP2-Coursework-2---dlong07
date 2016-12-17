
/**
 * Concrete class for a newspaper subscription
 * 
 * @author Daniel Long
 * @version 1.1
 */
public class NewspaperSubscription extends Subscription implements HasAddress, BoundedCharge
{
    //instance variables
    private String newspaper;
    private String address;
    /**
    * Constructor for objects of class NewspaperSubscription
    * Creates a landLineSubscription object with a phoneNumber
    * 
    * @param newspaper - String containing name of the newspaper that the subscriber is subscribed to
    * @param address - String containing the address of the subscriber
    */
    public NewspaperSubscription(String subscriber, String newspaper, int standingChargeInPence, String address)
    {   
        super(subscriber, "Newspaper", standingChargeInPence);
        this.newspaper = newspaper;
        this.address = address;
    }
    
    /**
    * Overridden method from super class Subscription. Gets the value owed by the subscriber for the 
    * given billing period
    * 
    * @return int containing the charge for the subscriber for the given billing period
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
        return address;
    }
    
    /**
    * Getter method taken from BoundedCharge interface. Used to get the maximum chargeable ammount 
    * for a subscriber
    * 
    * 
    * @return int containing the maximum charge for a subscriber over a given billing period.
    */
    public int getMaxChargeInPence()
    {
        return 2;
    }
}
