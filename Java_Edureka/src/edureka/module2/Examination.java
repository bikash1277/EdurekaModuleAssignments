/**
 * 
 */
package edureka.module2;

import java.util.Scanner;

/**
 * @author BikashMishra
 *
 */
public class Examination {
	int MathematicsMark, EnglishMark, ScienceMark, SocialScienceMark;
	Scanner sc = new Scanner(System.in);

	public void getMarks() {
		System.out.println("Enter Mark of Mathematics:");
		MathematicsMark = sc.nextInt();
		if (MathematicsMark < 0 || MathematicsMark > 100) {
			System.out.println("Please enter between 0 to 100");
			MathematicsMark = sc.nextInt();
		}

		System.out.println("Enter Mark of English:");
		EnglishMark = sc.nextInt();
		if (EnglishMark < 0 || EnglishMark > 100) {
			System.out.println("Please enter between 0 to 100");
			EnglishMark = sc.nextInt();
		}

		System.out.println("Enter Mark of Science:");
		ScienceMark = sc.nextInt();
		if (ScienceMark < 0 || ScienceMark > 100) {
			System.out.println("Please enter between 0 to 100");
			ScienceMark = sc.nextInt();
		}
		System.out.println("Enter Mark of Social Science:");
		SocialScienceMark = sc.nextInt();
		if (SocialScienceMark < 0 || SocialScienceMark > 100) {
			System.out.println("Please enter between 0 to 100");
			SocialScienceMark = sc.nextInt();
		}

	}

	public double calculatePercentage() {
		int totalMark = (MathematicsMark + EnglishMark + ScienceMark + SocialScienceMark);
		double percentage = (totalMark / 4);
		return percentage;
	}

	public String printGrade() {
		String Grade = "";
		if (calculatePercentage() < 40.0) {
			Grade = "Poor";
		} else if (calculatePercentage() >= 40.0 && calculatePercentage() <= 59.00) {
			Grade = "Average";
		} else if (calculatePercentage() >= 60.0 && calculatePercentage() <= 79.00) {
			Grade = "Good";
		} else if (calculatePercentage() > 80.0 && calculatePercentage() <= 89.00) {
			Grade = "Very Good";
		} else if (calculatePercentage() >= 90.0) {
			Grade = "Excellent";
			System.out.println("Your Grade is Excellent");
		} else {
			Grade = null;
		}
		return Grade;
	}
	public String questionToContinue() {
		
		String s=null;
		System.out.println("Would you like to continue calculation:");
		String answer=sc.next();
		if(answer.contains("Y")||answer.contains("y")) {
			s="Y";
		}
		else if(answer.contains("N")||answer.contains("n")) {
			s="N";
		}
		else {
			s="command is not proper";
			System.out.println("Command is not proper");
		}
		
		return s;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Examination exam = new Examination();
		do {
		exam.getMarks();
		System.out.println("Grade is ::" + exam.printGrade());
		}while(exam.questionToContinue().equals("Y"));
	}

}
