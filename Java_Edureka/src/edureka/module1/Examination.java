/**
 * 
 */
package edureka.module1;

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
		System.out.println("Enter Mark of English:");
		EnglishMark = sc.nextInt();
		System.out.println("Enter Mark of Science:");
		ScienceMark = sc.nextInt();
		System.out.println("Enter Mark of Social Science:");
		SocialScienceMark = sc.nextInt();
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Examination exam = new Examination();
		exam.getMarks();
		System.out.println("Grade is ::" + exam.printGrade());

	}

}
