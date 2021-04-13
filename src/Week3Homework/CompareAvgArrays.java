package Week3Homework;

public class CompareAvgArrays {

	public static void main(String[] args) {
		//Method to compare average values in two arrays
		System.out.println("Values in first array:");
		double[] numArray = new double[10];
		for (int index = 0; index < numArray.length; index++) {
			numArray[index] = index +10;
			System.out.println(numArray[index]);
		}
			
		System.out.println();
		System.out.println("Values in second array:");

		double[] anotherNumArray = new double[10];
		for (int i = 0; i < anotherNumArray.length; i++) {
			anotherNumArray[i] = i +3;
			System.out.println(anotherNumArray[i]);
		}
				
		System.out.println();
		System.out.println("Is average of 1st array > average of 2nd? ");
		System.out.println(compareAvgArray(numArray, anotherNumArray));
		}

		public static boolean compareAvgArray(double[] firstArray, double[] secondArray) {
			int sum1 = 0;
			double avg1 = 0;
			int sum2 = 0;
			double avg2 = 0;
			
			for (double number1 : firstArray) {
				sum1 += number1;
			}
			avg1 = sum1 / firstArray.length;
			
			for (double number2 : secondArray) {
				sum2 += number2;
			}
			avg2 = sum2 / secondArray.length;
			
			return avg1 > avg2; 
		}
					
	}