package Week3Homework;

public class WordConcatenation {

	public static void main(String[] args) {
		//Method to concatenate strings
		System.out.println(wordConcat("Hello", 3));

	}

	public static String wordConcat(String word, int n) {
		String wordRepeat = "";
		
		for (int i=1; i <= n; i++) {
			wordRepeat += word;
		}
		
		return wordRepeat; 
	}
	
	
}
