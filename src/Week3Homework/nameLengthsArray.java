package Week3Homework;

public class nameLengthsArray {
	
	public static void main(String[] args) {
		// Array of Names
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//Array of Name Lengths of Names array
		int[] nameLengths = new int[6];
		
		for (int x = 0; x < nameLengths.length; x++) {
			nameLengths[x] = names[x].length();
			System.out.println(nameLengths[x] + " characters in " + names[x]);
		}
		
		//Sum of name lengths in nameLengths array
		int totalCharsInNames = 0;
		for (int z = 0; z < nameLengths.length; z++) {
			totalCharsInNames += nameLengths[z];
		}
		System.out.println("Sum of the lengths of the names in the namesLength array:  " + totalCharsInNames);
		
		//Sum of name lengths in nameLengths array using Enhanced for loop
		// **Total came out as 25 instead of 23 ???
//		int totalNameLengths = 0;
//		for (int nameLength : nameLengths) {
//			totalNameLengths += nameLengths[nameLength];
//		}
//		System.out.println(totalNameLengths);
	}

}
