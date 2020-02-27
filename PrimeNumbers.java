package PrimeNumbers;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println(isPrime(num));
		
		if (isPrime(num)) {
			System.out.println(num + " is a prime number\n");
		}
		else {
			System.out.println(num + " is not a prime number\n");
		}

	}
	
	public static boolean isPrime(int n) {
		
		boolean result = true;
		for (int i = 2; i < Math.sqrt(n); ++i ) {
			
			if (n%i == 0) {
				result =  false;
				
			}
			
		}
		return result;
	}

}
