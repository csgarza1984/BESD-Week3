package Week3Homework;

public class DetermineGrade {

	public static void main(String[] args) {
		///Method to determine letter grade based on average of array of assignment grades
		double[] gradesArray = new double[5];
		gradesArray[0] = 78.4;
		gradesArray[1] = 91.2;
		gradesArray[2] = 87.5;
		gradesArray[3] = 69.8;
		gradesArray[4] = 82.0;
		
		System.out.println("Assignment grades are:");
		for (int index = 0; index < gradesArray.length; index++) {
			System.out.println("Assignment " + index + " = " + gradesArray[index]);
		}
		System.out.println();
		System.out.println("Your letter grade is:  " + letterGrade(gradesArray));
	}

		public static char letterGrade(double[] assignmentGrades) {
			double sum = 0;
			double avg = 0;
			
			for (double number : assignmentGrades) {
				sum += number;
			}
			avg = sum / assignmentGrades.length;
			
			char gradeLetter;
			if (avg >= 90.0) {
				gradeLetter = 'A';
			}
			else if (avg >= 80.0) {
				gradeLetter = 'B';
			}
			else if (avg >= 70.0) {
				gradeLetter = 'C';
			}
			else if (avg >= 60.0) {
				gradeLetter = 'D';
			}
			else gradeLetter = 'F';
						
			return  gradeLetter;
		}
			
}