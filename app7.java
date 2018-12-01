
public class app7 {

	private static final char[] IShouldntBuyIcecream = null;

	public static void main(String[] args, int isHotOutside, int wontBuyMilk) {
		// TODO Auto-generated method stub
		
	// 2.In Eclipse, create the following Boolean variables and choose what values they hold:
				//a.isHotOutside
				//b.isWeekday
				//c.hasMoneyInPocket
		
	//3.Create the following variables (not boolean type, choose the best data type for the variable):
				///a.costOfMilk 
				///b.moneyInWallet 
				///c.thirstLevel (how thirsty you are on a scale of 1-10)
		//4.Using the variables you created above and Boolean operators, 
				//create variables for the following scenarios:
				//a.shouldByIcecream – this should be true if it 
				//is hot outside and there is money in your pocket 
				//b.willGoSwimming – this should be true if 
				//it is hot outside and it is not a weekday
				//c.isAGoodDay – this should be true 
				//if it is hot outside, there is money in your pocket, and it is not a weekday
				//d.willBuyMilk – this should be true if it is hot outside, 
				//and thirstLevel is greater than or equal to 3, and 
				//moneyInWallet is greater than or equal to 2 times the cost of milk.
		
		//Example: If I had the variables isWeekday and isSummer and I was going to create 
		//a variable isSchoolDay, I would do something like the following:
		//boolean isSchoolDay = isWeekday && !isSummer;
		
		//boolean isHotOutside = 100 == 100; 
		///System.out.println(isHotOutside);
		
		//boolean isWeekday = 5 > 2;
		//System.out.println(isWeekday);
		
		//boolean hasMoneyInPocket = 500 != 50;
		//System.out.println(hasMoneyInPocket);
		
		
		
		boolean itsHotOutside= 100 == 100; // boolean shouldByIcecream == isHotOutside  
		System.out.println(itsHotOutside);
		boolean isWeekday = 5 > 2 && 10 > 2;
		System.out.println(isWeekday);
		boolean hasMoneyInPocket = 500 != 50;
		System.out.println(hasMoneyInPocket);
		
		
		double costOfMilk = 3.00;
		System.out.println(costOfMilk);
		int moneyInWallet = 500;
		System.out.println(moneyInWallet);
		double thirstLevel = 6;
		System.out.println(thirstLevel);
		for(int i = 1; i <= 10; i++)
        {
            System.out.println("thirstLevel = 6");
            
        }
		
		
		//4.Using the variables you created above and Boolean operators, 
		//create variables for the following scenarios:
		//a.shouldByIcecream – this should be true if it 
		//is hot outside and there is money in your pocket 
		//b.willGoSwimming – this should be true if 
		//it is hot outside and it is not a weekday
		//c.isAGoodDay – this should be true 
		//if it is hot outside, there is money in your pocket, and it is not a weekday
		//d.willBuyMilk – this should be true if it is hot outside, 
		//and thirstLevel is greater than or equal to 3, and 
		//moneyInWallet is greater than or equal to 2 times the cost of milk.

//Example: If I had the variables isWeekday and isSummer and I was going to create 
//a variable isSchoolDay, I would do something like the following:
//boolean isSchoolDay = isWeekday && !isSummer;
		
		double shouldByIcecream = 5;
		if (shouldByIcecream > 5) {
			System.out.println(IShouldntBuyIcecream);
		}
		else if (shouldByIcecream < 3) {
			char[] IShouldBuyIcecream = null;
			System.out.println(IShouldBuyIcecream);
		}
		
		double iShouldByIcecream = 5;
		char[] IWillBuyIcecream = null;
		if (isHotOutside > 120) {
			System.out.println(IWillBuyIcecream);
		}
		else if (IWillBuyIcecream != null) {
			char[] IShouldBuyIcecream = null;
			System.out.println(isHotOutside);
		}
		
		double iShouldGoSwimming = 20;
		if (iShouldGoSwimming > 4) {
			System.out.println("i Will Go Swimming");
		}
		else if (iShouldGoSwimming < 5) {
			System.out.println("I'm Going To Swim");
		}
		
		double isAGoodDay = 75;
		if (isAGoodDay == 75) {
			System.out.println("isAGoodDay");
		}
		else if (isAGoodDay == 75) {
			System.out.println("ItsStillAGoodDay");
		}
		
		double willBuyMilk = 3;
		if (willBuyMilk == 3) {
			System.out.println("isHotOutside");
		}
		else if (wontBuyMilk < 5) {
			System.out.println("MilkIsTooMuchEvenOnAHotDay");
		}
		
		double thirstLevel1 = 3;
		int i = 0;
		if (thirstLevel1 > 3) {
			System.out.println("checkMoneyInWallet");
		}
		else if (thirstLevel1 == 2 * i) {
			System.out.println("leaveMoneyInWallet");
		}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


