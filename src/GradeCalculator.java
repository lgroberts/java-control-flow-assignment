import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		// 1. Initialize any variables and objects you need (i.e. a scanner, some
		// counters for a total running sum, and a number tracking the # of scores inputted
		Scanner scnr = new Scanner(System.in);
		double runningSum = 0;
		double countOfScores = 0;
		double inputScore = 0;
		double averageScore = 0;
		
		// 2. Make a loop that repeatedly asks the user for a number and won't stop
		// until the user answers using a negative number
		// 3. Add some error checking for when a user inputs a number over 100 - we
		// should skip that input and start the loop
		// over to ask again
		do {
			System.out.print("Please enter a number: ");
			inputScore = Double.parseDouble(scnr.nextLine());
			if (inputScore <= 100 && inputScore >=0) {
				countOfScores = countOfScores + 1;
				runningSum = runningSum + inputScore;
			}
		}
		while (inputScore >= 0);
		
		// 4. Calculate the average of all scores collected during the loop
		averageScore = (runningSum / countOfScores);
		
		// 5. Display the average grade and corresponding message
		// - If over 90: "Excellent Work!"
		// - If over 80: "Good Job!"
		// - If over 70: "Keep it up!"
		// - anything else: "Let's work hard to get those grades up!"
		if (averageScore > 90) {
			System.out.println("\nExcellent Work!");
		} else if (averageScore > 80 && averageScore <= 90) {
			System.out.println("\nGood Job!");
		} else if (averageScore > 70 && averageScore <= 80) {
			System.out.println("\nKeep it up!");
		} else if (averageScore <= 70) {
			System.out.println("\nLet's work hard to get those grades up!");
		} else {
			System.out.println("\nError! Average score not calculated. Please rerun the program.");
		}
		
		//System.out.println(runningSum);
		//System.out.println(countOfScores);
		//System.out.println(averageScore);
		
		
		scnr.close();
	}
}