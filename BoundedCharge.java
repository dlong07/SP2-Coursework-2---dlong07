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
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    int getMaxChargeInPence();
}