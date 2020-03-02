package TechCircle_Java_February_2020_HomeWork;
import java.io.*;
import java.util.*;
//import AllMethodsWithSolutions.java;

public class RunTasks {
	public static void main(String[] args) throws Throwable{
		int taskNum=0;
		Boolean keepProgram = true;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (keepProgram) {
		
			AllMethodsWithSolutions.showIntro();     // Display enumerated tasks with description		
		
			try {
				taskNum = Integer.parseInt(reader.readLine());     // Enter Task number 
			}
			catch (Exception choiceException) {
				taskNum = 0;        // if not an integer then make it 0
			}
			
		switch (taskNum) {
		
		case 1:  			
			System.out.println("Running Task 1");
			try { System.out.println("*****  Task 1 output: " + AllMethodsWithSolutions.solveTask1()); }
			catch (Exception myE) { System.out.println("Exception in Task 1: " + myE); }
			break;
		case 2:  			
			System.out.println("Running Task 2");
			try { System.out.println("*****  Task 2 output: " + AllMethodsWithSolutions.solveTask2()); }
			catch (Exception myE) { System.out.println("Exception in Task 2: " + myE); }
			break;
		case 3:  			
			System.out.println("Running Task 3");
			try { System.out.println("***** Task 3 output: " + AllMethodsWithSolutions.solveTask3()); }
			catch (Exception myE) { System.out.println("Exception in Task 3: " + myE); }
			break;
		case 4:  			
			System.out.println("Running Task 4");
			try { System.out.println("***** Task 4 output: " + AllMethodsWithSolutions.solveTask4()); }
			catch (Exception myE) { System.out.println("Exception in Task 4: " + myE); }
			break;
		case 5:  			
			System.out.println("Running Task 5");
			try { System.out.println("***** Task 5 output: " + AllMethodsWithSolutions.solveTask5()); }
			catch (Exception myE) { System.out.println("Exception in Task 5: " + myE); }
			break;
		case 6:  			
			System.out.println("Running Task 6");
			try { System.out.println("***** Task 6 output: " + AllMethodsWithSolutions.solveTask6()); }
			catch (Exception myE) { System.out.println("Exception in Task 6: " + myE); }
			break;
		case 7:  			
			System.out.println("Running Task 7");
			
			try { System.out.println("***** Task 7 output: ");  AllMethodsWithSolutions.solveTask7(); }
			catch (Exception myE) { System.out.println("Exception in Task 7: " + myE); }
			break;
		case 8:  			
			System.out.println("Running Task 8");
			try { System.out.println("***** Task 8 output: "); AllMethodsWithSolutions.solveTask8(); }
			catch (Exception myE) { System.out.println("Exception in Task 8: " + myE); }
			break;
		case 9:  			
			System.out.println("Running Task 9");
			try { System.out.println("***** Task 9 output: "); AllMethodsWithSolutions.solveTask9(); }
			catch (Exception myE) { System.out.println("Exception in Task 9: " + myE); }
			break;
		case 10:  			
			System.out.println("Running Task 10");
			try { System.out.println("***** Task 10 output: " + AllMethodsWithSolutions.solveTask10()); }
			catch (Exception myE) { System.out.println("Exception in Task 10: " + myE); }
			break;
		default:
			keepProgram = false;
			System.out.println("Thank you. Exiting program...");
			break;
		}
	
		}
		

	}

}
