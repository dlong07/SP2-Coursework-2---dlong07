
/**
 * Abstract subclass of subscription. Used as template for a phone subscriptions
 * 
 * @author Daniel Long
 * @version 1.1
 */
public abstract class PhoneSubscription extends Subscription
{
    // instance variable
    String PhoneNumber;
    /**
     * Constructor for objects of class PhoneSubscription
     * User the contructor of Subscription to create required instance variables
     * 
     * @param containing the number String container
     */
    public PhoneSubscription(String number)
    {
        // Force the concrete classes to initalise number
        super("","",1);
        this.PhoneNumber = number;
    }
}
