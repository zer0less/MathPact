// Anselme Sorin
// Calculate Math Libraries
// All the methods for the Calculate class object
// August 30, 2021 to September  , 2021
public class Calculate {
	
	// Returns the square of the value -- Takes 1 integer, returns integer
	public static int square(int number) {
		return number * number;
	}
	
	// Returns the cube of the value -- Takes 1 integer, returns integer
	public static int cube(int number) {
		return square(number) * number;
	}
	
	// Returns the average of 2 values -- Takes 2 doubles, returns double
	public static double average(double number1, double number2) {
		return (number1 + number2) / 2;
	}
	// Returns the average of 3 values -- Takes 3 doubles, returns double
	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3) / 3;
	}
	
	public static double average(double... numbers) {
		double result = 0;
		int count = 0;
		for (double num : numbers) {
			result += num;
			count++;
		}
		return result / count;
	}
	
	public static int middle(int... numbers) {
		int result = 0;
		int count = 0;
		for (int num : numbers) {
			result += num;
			count++;
		}
		return result / count;
	}
	
	// Converts radians into degrees -- Takes 1 double, returns double
	public static double toDegrees(double rad) {
		return rad * (180 / 3.14159);
	}
	
	// Converts degrees into radians -- Takes 1 double, returns double
	public static double toRadians(double deg) {
		return deg * (3.14159 / 180);
	}
	
	// Calculates the discriminant with the values -- Takes 3 doubles, returns double
	public static double discriminant(double a, double b, double c) {
        return (b * b) + (-4 * a * c);
    }
	
	// Converts a mixed number into a fraction -- Takes 3 integers, returns String
	public static String toImproperFrac(int number, int numerator, int denominator) {
		if (denominator == 0) throw new IllegalArgumentException("Denominator 0");
		
		numerator = (number * denominator) + numerator;
		
		return numerator + "/" + denominator;
	}
	
	// Converts a fraction in a mixed number -- Takes 2 integers, returns String
	public static String toMixedNum(int numerator, int denominator) {
		if (denominator == 0) throw new IllegalArgumentException("Denominator 0");
		
		int number = numerator / denominator;
		numerator = numerator % denominator;
		
		return number + "_" + numerator + "/" + denominator;
	}
	
	// Multiplies out the binomials with the values -- Takes 4 integers and 1 string, returns String
	public static String foil(int n1, int n2, int n3, int n4, String x) {
		int a = n1 * n3;
		int b = (n1 * n4) + (n3 * n2);
		int c = n2 * n4;
		
		return a + x + "^2" + " + " + b + x + " + " + c;
	}
	
	// Evaluates if the value is evenly divisible by another number -- Takes 2 integers, returns boolean
	public static boolean isDivisibleBy(int numerator, int denominator) {
		if (denominator == 0) throw new IllegalArgumentException("Denominator 0");
		boolean result = false;
		
		if (numerator % denominator == 0) result = true;
		
		return result;
	}
	
	// Converts a negative number to a positive number -- Takes 1 double, returns double
	public static double absValue(double number) {
		double result = number;
		
		if (number < 0) result = number * -1;
		
		return result;
	}
	
	// Returns the highest of the 2 numbers -- Takes 2 doubles, returns double
	public static double max(double number1, double number2) {
		double result = number1;
		if (number2 > number1) result = number2;
		return result;
	}
	// Returns the highest of the 3 numbers -- Takes 3 doubles, returns double
	public static double max(double number1, double number2, double number3) {
		double result = number1;
		if (number1 > number3) result = max(number1, number2);
		else result = max(number2, number3);
		return result;
	}
	
	public static double max(double... numbers) {
		double result = numbers[0];
		for (double num : numbers) {
			if (num > result) result = num;
		}
		return result;
	}
	public static int max(int... numbers) {
		int result = numbers[0];
		for (int num : numbers) {
			if (num > result) result = num;
		}
		return result;
	}
	
	// Returns the lowest of the 2 numbers -- Takes 2 integers, returns integer
	public static int min(int number1, int number2) {
		int result = number1;
		if (number2 < number1) result = number2;
		return result;
	}
		
	public static double min(double... numbers) {
		double result = numbers[0];
		for (double num : numbers) {
			if (num < result) result = num;
		}
		return result;
	}
	public static int min(int... numbers) {
		int result = numbers[0];
		for (int num : numbers) {
			if (num < result) result = num;
		}
		return result;
	}
	
	// Returns the number with 2 decimal places -- Takes 1 double, returns double
	public static double round2(double number) {
		boolean negative = false;
		double result;
		if (number < 0) {
			negative = true;
			number = absValue(number);
		}
		
		result = (number * 1000) / 1;
		if (result % 10 >= 5) result = result + 10;
		result = (int) (result / 10);
		result = result / 100;
		
		if (negative) result = result * -1;
		return result;
	}
	
	// Returns the value to the second value power -- Takes 1 double and 1 integer, returns double
	public static double exponent(double base, int exp) {
		if (base == 0) throw new IllegalArgumentException("Base 0");
		if (exp < 0) throw new IllegalArgumentException("Negative power:" + exp);
		double result = 1;
		
		for (int i = 1; i <= exp; i++)
			result = result * base;
		
		return result;
	}
	
	// Returns the factorial of a value -- Takes 1 integer, returns integer
	public static int factorial(int number) {
		if (number < 0) throw new IllegalArgumentException("Negative number:" + number);
		int result = 1;
		
		for (int i = 1; i <= number; i++)
			result = result * i;
		
		return result;
	}
	
	// Evaluates if a value is a prime number -- Takes 1 integer, returns boolean
	public static boolean isPrime(int number) {
		if (number < 0) throw new IllegalArgumentException("Negative number:" + number);
		boolean result = true;
		
		for (int i = 2; i <= number; i++) {
			if (isDivisibleBy(number, i) && i != number) result = false;
		}
		if (number == 1 || number == 0) result = false;
		
		return result;
	}
	
	// Returns the greatest common factor of 2 values -- Takes 2 integers, returns integer
	public static int gcf(int number1, int number2) {
		if (number1 < 0) number1 = (int) absValue(number1);
		if (number2 < 0) number2 = (int) absValue(number2);
		
		int result = number1;
		if (number1 == 0) result = number2;
		for (int i = 1; i <= number1 && i <= number2; i++) {
			if (isDivisibleBy(number1, i) && isDivisibleBy(number2, i)) result = i;
		}
		
		return result;
	}
	
	// Returns the square root of a value -- Takes 1 double, returns double
	public static double sqrt(double number) {
		if (number < 0) throw new IllegalArgumentException("Negative seed:" + number);
		double result;
		
		if (number == 1) return 1;
		result = (number / 2);
		while (absValue(number - (result * result)) > 0.005) result = 0.5 * (number / result + result);
		
		return round2(result);
	}
	
	// Returns the roots of a quadratic equation -- Takes 3 integers, returns String
	public static String quadForm(int a, int b, int c) {
		String result = "";
		double discriminant = discriminant(a, b, c);

		if (discriminant < 0) result = "no real roots";
		
		else if (discriminant == 0) {
			double number1 = -1 * b;
			double number2 = sqrt(discriminant);
			double number3 = 2 * a;
			
			double root = round2((number1 + number2) / number3);
			
			result = root + "";
		}
		
		else {
			double number1 = -1 * b;
			double number2 = sqrt(discriminant);
			double number3 = 2 * a;
			
			double root1 = round2((number1 + number2) / number3);
			double root2 = round2((number1 - number2) / number3);
			
			double min = min(root1, root2);
			double max = max(root1, root2);
			
			result = min + " and " + max;
		}
		
		return result;
	}
	
}
