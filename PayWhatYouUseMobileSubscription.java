
/**
 * Concrete class for PayWhatYouUseMobileSubscription
 * 
 * @author Daniel Long
 * @version 1.1
 */
public class PayWhatYouUseMobileSubscription extends MobileSubscription
{
    /**
    * Constructor for objects of class PayWhatYouUseMobileSubscription
    * 
    * @param    subscriber - String containing subscribers name - non null
    * @param    phoneNumber - String containing the subcribers phone number - non null
    */
    public PayWhatYouUseMobileSubscription(String subscriber, String phoneNumber)
    {
        super(subscriber,"PayAsYouGo Mobile User",0,phoneNumber);
    }

    /**
     * A method to compute the total charge for a billing period for a pay as you subscriber.
     * Calculated by taking the product of 40 pence and the number of minutes called 
     * over the billing period, added to the product of 20 pence and the number of text 
     * messages sent over the billing period
     * 
     * @return  an int for the amount of the billing period in pence
     */
    @Override
    public int computeTotalChargeInPence()
    {
        return (40*getCallMinutes())+(getTextMessages()*20);
    }
}
