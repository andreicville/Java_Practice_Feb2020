package TechCircle_Java_February_2020_HomeWork;
import java.util.*;
import java.io.*;

public class AllMethodsWithSolutions {
	public static void showIntro() {                    // SHOE TASKS DESCRIPTION
		System.out.println();
		System.out.println("       -----------------------------------------------------------         ");
		System.out.println("Task 1: Write a Java method to find the smallest number among three numbers.");
		System.out.println("Task 2: Write a Java method to compute the average of three numbers.");
		System.out.println("Task 3: Write a Java method to display the middle character of a string.");
		System.out.println("Task 4: Write a Java method to count all vowels in a string.");
		System.out.println("Task 5: Write a Java method to count all words in a string.");
		System.out.println("Task 6: Write a Java method to compute the sum of the digits in an integer. ");
		System.out.println("Task 7: Write a Java method to find the smallest number among three numbers.");
		System.out.println("Task 8: Write a Java method to find the smallest number among three numbers.");
		System.out.println("Task 9: Write a Java method to find the smallest number among three numbers.");
		System.out.println("Task 10: Write a Java method to check whether a year (integer) entered by the user is a leap year or not.");
		System.out.println("Enter the number of the Task (enter anything else to exit): ");
		}
	
	public static Integer solveTask1() {                       // TASK 1 SOLVED HERE
		int num1 =0, num2=0, num3=0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Input the first number: ");
		num1 = Integer.parseInt(reader.readLine());
		System.out.println("Input the second number: ");
		num2 = Integer.parseInt(reader.readLine());
		System.out.println("Input the third number: ");
		num3 = Integer.parseInt(reader.readLine());
		}
		catch (Exception myE) { System.out.println("Input number exception in Task1: " + myE); }
		
		if ((num1 < num2) && (num1 <= num3)) return num1;
		else if ((num2 < num1) && (num2 <= num3)) return num2;
		else return num3;
	
      }
// Average number - TASK 2
	public static Integer solveTask2() {                       // TASK 2 SOLVED HERE
		int num1 =0, num2=0, num3=0, aNum=0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Input the first number: ");
			num1 = Integer.parseInt(reader.readLine());
			System.out.println("Input the second number: ");
			num2 = Integer.parseInt(reader.readLine());
			System.out.println("Input the third number: ");
			num3 = Integer.parseInt(reader.readLine());
		}
		catch (Exception myE) { System.out.println("Input number exception in Task2: " + myE); }
		
		aNum = (num1 + num2 + num3) / 3;
		return aNum;
	
      }
	// Middle character - TASK 3
	public static String solveTask3() {                       // TASK 3 SOLVED HERE
		String inputString="", middleChar="";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Input a string: ");
			inputString = reader.readLine();
		}
		catch (Exception myE) { System.out.println("Input string exception in Task3: " + myE); }
		if (inputString.length() % 2 == 0) {
			middleChar = inputString.substring( (inputString.length()/2)-1,(inputString.length()/2)+1);
		}
		else {
			middleChar = inputString.substring(inputString.length()/2, (inputString.length()/2)+1);
		}
		return middleChar;
	
      }
	// COUNTING VOWELS
	public static char[] myVowels = new char[] {'a', 'e', 'i', 'o', 'u'};
	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		for ( char v : myVowels) {
			if (c == v) return true;
		}
		return false;
	}
	public static Integer solveTask4() {                       // TASK 4 SOLVED HERE
		int countV =0;
		
		String inputString="";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Input s string: ");
		inputString = reader.readLine();
		}
		catch (Exception myE) { System.out.println("Input string exception in Task4: " + myE); }
		
		for (int i=0; i<inputString.length(); i++) {
			if (isVowel(inputString.charAt(i))) countV++;
		}
		return countV;
	
      }
	// count words
	public static Integer solveTask5() {                       // TASK 5 SOLVED HERE
		int countWords=0;
		String inString="";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Input string: ");
		inString = reader.readLine();
		}
		catch (Exception myE) { System.out.println("Input string exception in Task5: " + myE); }
		String[] allWordsArray = inString.split("\\s+");
		countWords = allWordsArray.length;
		return countWords;
	
      }
	// sum of digits
	public static Integer solveTask6() {                       // TASK 6 SOLVED HERE
		int intInNum =0, sum =0;
		String strInNum = "";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Enter number to count digits in: ");
		strInNum = reader.readLine();
		intInNum = Integer.parseInt(strInNum);
		}
		catch (Exception myE) { System.out.println("Entered number exception in Task6: " + myE); }
		
		for (int i=0; i<strInNum.length();i++) {
			sum += Integer.parseInt( Character.toString(strInNum.charAt(i)) );
		}
		return sum;
	
      }
	// 50 pentagonal numbers
	public static int getPentagonalNumber(int x) {
		return (x * (3*x - 1)) / 2;
	}
	public static void solveTask7() {                       // TASK 7 SOLVED HERE
		int lines =0;
		for (int i =1; i<=50; i++) {
			System.out.format("%04d", getPentagonalNumber(i));
			System.out.print(" ");
			if (i % 10 == 0) System.out.println();
		}
		
		
	
      }
	// Future investment
	public static void solveTask8() {                       // TASK 8 SOLVED HERE
		Double dblAmount =0.0, dblRate=0.0, dblMonthlyInterestRate=0.0, dblValue=0.0;
		int intYears=0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Input the investment amount: ");
		dblAmount = Double.parseDouble(reader.readLine());
		System.out.println("Input the rate of interest: ");
		dblRate = Double.parseDouble(reader.readLine());
		System.out.println("Input number of years: ");
		intYears = Integer.parseInt(reader.readLine());
		}
		catch (Exception myE) { System.out.println("Input data exception in Task8: " + myE); }
		System.out.println("Years     FutureValue");
		for (int i =1; i<=intYears; i++) {
			dblMonthlyInterestRate = dblRate*0.01 / 12;
			dblValue = dblAmount * Math.pow(1 + dblMonthlyInterestRate,  i*12);
			System.out.println(i + "          " + String.format("%.2f", dblValue));
		}
		
	
      }
	// print characters
	public static void printChars(char char1, char char2) {
		for (int i = 1; char1 <= char2; i++, char1++) {
			System.out.print(char1 + " ");
			if (i % 20 == 0) System.out.println();
		}
	}
	public static void solveTask9() {                       // TASK 9 SOLVED HERE
		char char1=0, char2= 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Input the first character: ");
		char1 = reader.readLine().charAt(0);
		System.out.println("Input the second character: ");
		char2 = reader.readLine().charAt(0);
		
		}
		catch (Exception myE) { System.out.println("Input chars exception in Task9: " + myE); }
		printChars(char1, char2);
		
		
      }
	//  Leap year
	
	public static boolean solveTask10() {                       // TASK 10 SOLVED HERE
		int intYear =0;
		Boolean leapYear = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		System.out.println("Input year: ");
		intYear = Integer.parseInt(reader.readLine());
		
		}
		catch (Exception myE) { System.out.println("Input year exception in Task 10: " + myE); }
		
		if (intYear % 400 == 0) leapYear = true;
		else if (intYear % 100 == 0) leapYear = false;
		else if (intYear % 4 == 0) leapYear = true;
		else leapYear = false;
	     
		return leapYear;
      }
	
}