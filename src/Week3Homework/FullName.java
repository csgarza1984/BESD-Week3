package Week3Homework;

public class FullName {

	public static void main(String[] args) {
		//Method to concatenate first and last names
		String fName = "Tanya";
		String lName = "Polinski";
		
		System.out.println(fullName(fName, lName));

			}

			public static String fullName(String firstName, String lastName) {
				return firstName + " " + lastName;
			 }
			
		}
