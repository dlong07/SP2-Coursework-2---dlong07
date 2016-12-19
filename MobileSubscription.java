/**
 * Abstract subsclass of PhoneSubscription
 * 
 * @author Daniel Long
 * @version 1.1
 */
public abstract class MobileSubscription extends PhoneSubscription
{
    //instance variable
    private int textsSent = 0; // used to monitor the number of texts sent by the subscriber
                               //set to zero when created as the object can't have sent any texts beforehand
    /**
     * Constructor for objects of class MobilePhoneSubsription
     * 
     * 
     */
    public MobileSubscription(String subscriber, String subscriptionName, int standingChargeInPence, String phoneNumber)
    {
        super(subscriber,subscriptionName, standingChargeInPence, phoneNumber);
        // passes subscriber, subscriptionName, standingCharge and phoneNumber params to superclass constructor
    }
    
    /**
    * Setter method to keep add the number of texts used by the subscriber over a given billing period. 
    * 
    * @param    int of containing the number of texts sent by user
    */
    public void sendTextMessages(int number)
    {
        textsSent += number; //number of texts sent added to total
    }
    
    /**
    * Getter method to keep track of the number of text messages sent
    * 
    * 
    * @return     int containing the number minutes used in a given billing period
    */    
    public int getTextMessages()
    {
        return this.textsSent;
    }
    
    /**
    * Setter to reset the texts sent by all MobilePhoneSubscriptions at the end of a billing period.
    * Overridding empty method set by Subscription and PhoneSubscription 
    * 
    * Also calls the resetComsuption() method from the superclass to reset the class' minutes
    */
    @Override
    public void resetConsumption()
    {
        textsSent = 0;
        super.resetConsumption(); // call to class PhoneSubscription tp reset minutes used. No need to rewrite it here
    }
}
