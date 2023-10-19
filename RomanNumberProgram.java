package RomanNumber;
import java.util.HashMap;
import java.util.Scanner;

public class RomanNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = scanner.nextLine().toUpperCase();

	        int result = romanToInteger(romanNumeral);
	        if (result != -1) {
	            System.out.println("The integer value of " + romanNumeral + " is: " + result);
	        } else {
	            System.out.println("Invalid Roman numeral input.");
	        }
	    }

	    public static int romanToInteger(String s) {
	        HashMap<Character, Integer> romanValues = new HashMap<>();
	        romanValues.put('I', 1);
	        romanValues.put('V', 5);
	        romanValues.put('X', 10);
	        romanValues.put('L', 50);
	        romanValues.put('C', 100);
	        romanValues.put('D', 500);
	        romanValues.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            int currentValue = romanValues.getOrDefault(s.charAt(i), 0);

	            if (currentValue >= prevValue) {
	                result += currentValue;
	            } else {
	                result -= currentValue;
	            }

	            prevValue = currentValue;
	        }

	        // Check if the input was a valid Roman numeral
	        if (result != 0) {
	            return result;
	        } else {
	            return -1; // Invalid input
	        }

	}

}
