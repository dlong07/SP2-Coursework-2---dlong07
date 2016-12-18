public class SubscriptionMain
{
    public static void main(String[] args)
    {
         NewspaperSubscription SH = new NewspaperSubscription("Sherlock Holmes","The Strand Magazine",10,"22B Baker Street");
         NewspaperSubscription GB = new NewspaperSubscription("George Birkbeck","The Lamp and Owl",100,"43 Gordon Square");
         LandLineSubscription JDf = new LandLineSubscription("Jane Doe","02079460001","Malet Street");
         PayWhatYouUseMobileSubscription JDm = new PayWhatYouUseMobileSubscription("John Doe","07700900002");
         PowerUserMobileSubscription KD = new PowerUserMobileSubscription("Kim Doe","07700900003");
         
         JDf.makeCall(10010);
         
         JDm.makeCall(11000);
         JDm.sendTextMessages(20);
         
         KD.makeCall(1954);
         KD.sendTextMessages(1202);
         
         SH.endPeriod();
         SH.endPeriod();
         GB.endPeriod();
         GB.endPeriod();
         JDf.endPeriod();
         JDf.endPeriod();
         JDm.endPeriod();
         JDm.endPeriod();
         KD.endPeriod();
         KD.endPeriod();
         System.out.println(SH.getAddress());
         System.out.println(JDf.getAddress());
         System.out.println(SH.getMaxChargeInPence());
         System.out.println(KD.getMaxChargeInPence());
         System.out.println(GB.getMaxChargeInPence());
         
    }
}