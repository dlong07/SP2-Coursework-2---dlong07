
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
    private int minutesUsed = 0; // all phone subscriptions will need to keep track of the minutes they've used
                                 //set to zero when created as the object can't have used any minutes beforehand
    /**
     * Constructor for objects of class PhoneSubscription
     * User the contructor of Subscription to create required instance variables
     * 
     * @param containing the number String container
     */
    public PhoneSubscription(String subscriber, String subscriptionName, int standingChargeInPence, String phoneNumber)
    {
        super(subscriber, subscriptionName, standingChargeInPence);
        // passes subscriber, subscriptionName and standingCharge params to superclass constructor
        if(phoneNumber == null || phoneNumber == "") // make sure number is not null
        {
            throw new IllegalArgumentException("Phone number cannot be null! Please try again.");
        }
        else if(phoneNumber.length() < 10) // make sure number isn't too short
        {
            throw new IllegalArgumentException("Phone number entered is not long enough. Please try again.");
        }
        else if(phoneNumber.length() > 11) // make sure number isn't too long
        {
            throw new IllegalArgumentException("Phone number entered is too long. Please try again.");
        }
        this.phoneNumber = phoneNumber; 
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
        this.minutesUsed += minutes; // adds minutes used to the total
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
