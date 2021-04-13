package Week3Homework;

public class NeedADrink {

	public static void main(String[] args) {
		//Method to test need to buy a drink
		boolean isHot = true;
		double pocketMoney = 23.75;
		
		System.out.println("Is it hot outside?  " + isHot);
		System.out.println("How much money do I have?  $" + pocketMoney);
		System.out.println("If it's hot and I have more than $10.50, I will buy a drink.");
		System.out.println("Will I buy a drink?  " + willBuyDrink(isHot, pocketMoney));
			}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	return isHotOutside && moneyInPocket > 10.50; 
	}
			
}
