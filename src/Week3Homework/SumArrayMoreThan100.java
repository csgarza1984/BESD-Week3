package Week3Homework;

public class SumArrayMoreThan100 {

	public static void main(String[] args) {
		//Method to test for sum of array > 100
		int[] numArray = new int[10];
		for (int index = 0; index < numArray.length; index++) {
			numArray[index] = index +10;
			System.out.println(numArray[index]);
		}
		System.out.println(sumMoreThan100(numArray));
			}

			public static boolean sumMoreThan100(int[] numbers) {
				int sum = 0;
				
				for (int number : numbers) {
					sum += number;
				}
				
				return sum > 100; 
			}
			
	}
