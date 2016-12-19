/**
 * Concrete class for PowerUserMobileSubscription
 * 
 * @author Daniel Long
 * @version 1.1
 */
public class PowerUserMobileSubscription extends MobileSubscription implements BoundedCharge
{
    // instance variables
    private final int maxMins = 1800; //maximum number of minutes that a  subscriber will be charged for
    private final int maxTexts = 900; //maximum number texts that a subscriber will be charged for
    /**
     * Constructor for objects of class PowerUserMobileSubscription
     * 
     * @param    subscriber - String containing subscribers name - non null
     * @param    phoneNumber - String containing the subcribers phone number - non null
     */
    public PowerUserMobileSubscription(String subscriber, String phoneNumber)
    {
        super(subscriber,"Mobile power user",4000,phoneNumber);
         // passes subscriber, subscriptionName, standingCharge and phoneNumber params to superclass constructor
    }

    /**
     * Overridden method from Subscriber. Computes the total charge for a billing period for a pay as you subscriber
     * 
     * Calculated as the standing charge for the billing period +
     * the product of 10 pence and up to 1800 minutes over the billing period +
     * the product of 8 pence and up to 900 texts messages over the billing period
     * Anything above the maximum minutes and texts is free
     * 
     * @return  an int for the amount of the billing period in pence
     */
    @Override
    public int computeTotalChargeInPence()
    {
        if(getCallMinutes() >= maxMins && getTextMessages() >= maxTexts) //if over minimum usage, charge the maximum
        {
            return getMaxChargeInPence();
        }
        else if(getCallMinutes() < maxMins && getTextMessages() >= maxTexts) // if minumum chargable texts are used but not the minutes
        {
            return getStandingChargeInPence()+(maxTexts*8)+(getCallMinutes()*10); 
        }
        else if(getCallMinutes() >= maxMins && getTextMessages() < maxTexts) // if minumum chargable minutes are used but not the texts
        {
            return getStandingChargeInPence()+(maxMins*10)+(getTextMessages()*8);
        }
        else // else work out the charge for minutes and texts used and add to standing charge
        {
            return getStandingChargeInPence()+(getCallMinutes()*10)+(getTextMessages()*8); 
        }
    }
    
    /**
     * A method given by interface BoundedCharge to compute the maximum charge for usage over a billing period
     * Calculated at the maximum minutes * 10p plus the maximum texts * 8p
     * 
     * @return  an int for the amount of the billing period in pence
     */
    public int getMaxChargeInPence()
    {
        return getStandingChargeInPence()+(maxMins*10)+(maxTexts*8);
    }
}
