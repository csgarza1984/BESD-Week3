package Week3Homework;

public class AgesArray {

	public static void main(String[] args) {
		
		//array of ages
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		

		//subtract value of first element from value of last element
		int difference = ages[ages.length-1] - ages[0];
		System.out.println("Last element in array is " + ages[ages.length-1]);
		System.out.println("First element in array is " + ages[0]);
		System.out.println("Difference between them is " + difference);
		
		int sumOfAges = 0;
		for (int age : ages) {
			sumOfAges += age;
		}
		double averageAge = sumOfAges / ages.length;
		System.out.println(sumOfAges);
		System.out.println(ages.length);
		System.out.println(averageAge);
		System.out.println("The average age in the array is " + averageAge);
	}	
		
}
