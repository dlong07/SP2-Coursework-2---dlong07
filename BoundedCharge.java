/**
 * Interface to force classes NewspaperSubscription and PowerUserMobileSubscription to have
 * method getMaxChargeInPence
 * 
 * @author Daniel Long
 * @version 1.1
 */
public interface BoundedCharge
{
    /**
     * Method to get maximum charge for customers where charging has a limit
     * 
     * @return     int conatining the maximum amount to charge a subscriber
     */
    int getMaxChargeInPence();
}