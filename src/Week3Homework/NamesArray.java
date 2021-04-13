package Week3Homework;

public class NamesArray {

	public static void main(String[] args) {
		// Array of Names
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int sumOfNameLengths = 0;
		double averageNameLength;
		for (int index = 0; index < names.length; index++) {
			sumOfNameLengths += names[index].length();
		}
		System.out.println("Total characters in all names:  " + sumOfNameLengths);
		System.out.println("Average number of characters per name:  " + (double) sumOfNameLengths / names.length);
		
		String allNamesTogether = "";
		for (int i = 0; i < names.length; i++) {
			allNamesTogether = allNamesTogether + " " + names[i];
		}
		System.out.println(allNamesTogether);
	}

}
