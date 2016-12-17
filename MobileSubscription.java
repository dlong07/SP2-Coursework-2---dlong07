/**
 * Abstract subsclass of PhoneSubscription
 * 
 * @author Daniel Long
 * @version 1.1
 */
public abstract class MobileSubscription extends PhoneSubscription
{
    //instance variable
    private int textsSent; // used to monitor the number of texts sent by the subscriber
    /**
     * Constructor for objects of class MobilePhoneSubsription
     * 
     * 
     */
    public MobileSubscription(String subscriber, String subscriptionName, String phoneNumber)
    {
        super(subscriber,subscriptionName,phoneNumber);
        this.textsSent = 0; // initialised to zero as no text will have been sent when created
    }
    
    /**
    * Setter method to keep add the number of texts used by the subscriber over a given billing period. 
    * 
    * @param    int of containing the number of texts sent by user
    */
    public void sendTextMessages(int number)
    {
        textsSent += number;
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
}
