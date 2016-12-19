/**
 * Concrete class for a NewspaperSubscription object
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
    * Creates a landLineSubscription object with additional instance variables phoneNumber and address
    * 
    * @param    subscriber - String containing name of subscriber
    * @param    newspaper - String containing name of the newspaper that the subscriber is subscribed to - used for name of subscription
    * @param    standingChargeInPence - int containing the cost in pence of the given newspaper
    * @param    address - String containing the address of the subscriber
    */
    public NewspaperSubscription(String subscriber, String newspaper, int standingChargeInPence, String address)
    {   
        super(subscriber, newspaper, standingChargeInPence); // passes subscriber, newspaper and standingCharge params passed to superclass constructor
        if(newspaper == null || newspaper == "") // make sure that the newspaper name is entered
        {
            throw new IllegalArgumentException("Newspaper name cannot be null! Please try again.");
        }
        this.newspaper = newspaper;
        if(address == null || address == "") // make sure that the address is entered
        {
            throw new IllegalArgumentException("Address cannot be null! Please try again.");
        }
        this.address = address;
    }
    
    /**
    * Overridden method from class Subscription. Gets the amount owed by the subscriber for the 
    * given billing period
    * 
    * @return    int containing the charge for the subscriber for the given billing period
    */
    @Override
    public int computeTotalChargeInPence()
    {
        return getStandingChargeInPence();
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
    *  -Note- Doesn't necessarily need interface BoundedCharge if this is the same as standing charge
    * 
    * @return int containing the maximum charge for a subscriber over a given billing period.
    */
    public int getMaxChargeInPence()
    {
        return getStandingChargeInPence();
    }
}
