/**
 * Interface class for LandLineSubscription and NewspaperSubscription
 * Used to force these classes to use method getAddress
 * 
 * @author Daniel Long
 * @version 1.1
 */
public interface HasAddress
{
      /**
     * Method to get address of each subscriber
     * 
     * @return  String containing the address contained the corresponding Subscription object
     */
    String getAddress();
}
