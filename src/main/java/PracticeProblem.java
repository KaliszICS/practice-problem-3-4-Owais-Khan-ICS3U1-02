/**
	* Lesson: Nested Ifs
	* Author: Owais Ali Khan
	* Date Created: March 26, 2026
	* Date Last Modified: March 26, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int min(int num1, int num2, int num3) {
	     return Math.min(Math.min(num1, num2), num3);
	}
	
	public static boolean isLeapYear(int num) {
	     if (num%4 && (!num%100 || num%400)) {
	         return true;
	     return false;
		 }
	}
}
