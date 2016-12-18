
/**
 * Abstract subclass of subscription. Used as template for a phone subscriptions
 * 
 * @author Daniel Long
 * @version 1.1
 */
public abstract class PhoneSubscription extends Subscription
{
    // instance variables for all types of PhoneSubscription
    private String phoneNumber; // all phone subscriptions will need a phone number given by concrete classes
    private int minutesUsed; // all phone subscriptions will need to keep track of the minutes they've used
    /**
     * Constructor for objects of class PhoneSubscription
     * User the contructor of Subscription to create required instance variables
     * 
     * @param containing the number String container
     */
    public PhoneSubscription(String subscriber, String subscriptionName, int standingChargeInPence, String phoneNumber)
    {
        super(subscriber, subscriptionName, standingChargeInPence);
        this.phoneNumber = phoneNumber;
        this.minutesUsed = 0; //set to zero when created as they can't have used any minutes beforehand
    }
    /**
     * Getter method to return the subscriber's phone number
     * 
     * @return String containing subscriber's phone number
     */
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    /**
    * Setter method to keep track of the minutes used by the subscriber. 
    * make call is in this class all PhoneSubscription class will need to make calls
    * 
    * @param    int of containing the number of minutes used in the call
    */
    public void makeCall(int minutes)
    {
        this.minutesUsed += minutes;
    }
    
    /**
    * Getter method to keep track of the minutes used by the subscriber
    * 
    * 
    * @return     int containing the number minutes used in a given billing period
    */    
    public int getCallMinutes()
    {
        return minutesUsed;
    }
    
    /**
    * Setter to reset the minutes used by all PhoneSubscriptions at the end of a billing period.
    * Overridding empty method set by Subscription 
    * 
    */
   @Override
    public void resetConsumption()
    {
        minutesUsed = 0;
    }
   
}
