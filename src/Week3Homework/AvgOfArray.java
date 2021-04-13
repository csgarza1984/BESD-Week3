package Week3Homework;

public class AvgOfArray {

	public static void main(String[] args) {
		///Method to average values in an array
		int[] numArray = new int[10];
		for (int index = 0; index < numArray.length; index++) {
			numArray[index] = index +10;
			System.out.println(numArray[index]);
		}
		System.out.println();
		System.out.println("The average of the values in the array is:  " + averageArray(numArray));
			}

			public static double averageArray(int[] numbers) {
				int sum = 0;
				double avg = 0;
				
				for (int number : numbers) {
					sum += number;
				}
				
				return avg = (double) sum / numbers.length; 
			}
			
	}