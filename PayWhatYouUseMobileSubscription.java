
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
     */
    public PayWhatYouUseMobileSubscription()
    {

    }

    /**
     * A method to compute the total charge for a billing period for a pay as you subscriber
     * 
     * 
     * @return  an int for the amount of the billing period in pence
     */
    @Override
    public int computeTotalChargeInPence()
    {
        return 1;
    }
}
