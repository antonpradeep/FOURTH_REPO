package arrayPackage;

public class StringProblem1 {

	public static void main(String[] args) {
		
		if(isPalindromeString("appa")==true)
		{
			System.out.println("The given String is a Palindrome");
		}
		
		else
		{
			System.out.println("The Given string is not a palindrome");
		}
		
	}

	public static boolean isPalindromeString(String str) {
		
		String reverse = new StringBuilder(str).reverse().toString();

		return str.equals(reverse);
	}
}