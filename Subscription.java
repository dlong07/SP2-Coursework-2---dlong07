/**
 * Abstract SuperClass for the Project Subscription
 * All abstract and concrete classes below this in the hierarchy will be of type Subscription
 * 
 * @author Daniel Long
 * @version 1.1
 */
public abstract class Subscription
{
    private String subscriber;
    private String subscriptionName;
    private int standingChargeInPence;
    /**
     * Constructor to create an object of type subscription
     * 
     * @param subscriber - name of the subscriber; must not be null
     * @param subscriptionName - name of the subscribed service; must not be null
     * @param standingChargeInPence - the standing charge per billing period, expressed in pence; must not be negative
     *
     */
    public Subscription(String subscriber, String subscriptionName, int standingChargeInPence)
    {
        this.subscriber = subscriber;
        this.subscriptionName = subscriptionName;
        this.standingChargeInPence = standingChargeInPence;
    }
    
     /**
     * Abstract method to be used in all subclasses
     * Will be used to get the total charge per subscriber for a billing period
     *
     */
    public abstract int computeTotalChargeInPence();
    
    /**
     * Method does nothing at superclass level. Optional use for subclasses as not all will need it but can 
     * only fall here in the inheritance hierarchy
     * 
     * Used to reset the usage at the start of a billing period
     */
    public void resetConsumption()
    {
    }
    
    /**
     * Methed to end billing period. Again usage is optional but must fall here in inheritance hierarchy
     * 
     * Used to end a billing period
     */
    public final void endPeriod()
    {
        
    }
    
    /**
     * Methed to generate a bill for a given subscriber
     * 
     * @return String containing all billing information
     */
    public final String generateBill()
    {
        return "TEST";
    }
    
    /**
     * Getter method to return the name of the subscriber
     * 
     * @return subscriber
     */
    public String getSubscriber()
    {
        return "TEST";
    }
    
    /**
    * Getter method to return the subscription name
    * 
    * @return subscriptionName
    */
    public String getSubscriptionName()
    {
        return "TEST";
    }
    
    /**
    * Getter method to show the current amount owed by a subscriber. Doesn't need to be end of a billing period to use
    * 
    * @return int containing the current charge in pence
    */
    public int getStandingChargeInPence()
    {
        return 1;
    }
}