package arrayPackage;

public class ArrayClassP2 {

	public static void main(String[] args) {

		String str = "malayalam";

		System.out.println("The given string is " + str + "\n");

		char[] stringch = str.toCharArray();

		System.out.println("String is Converted to Array");

		System.out.println(stringch);

		System.out.println("\n" + "The length of the array is " + stringch.length + "\n");

		String Reverse = "";

		for (int a = stringch.length - 1; a >= 0; a--) {

			Reverse = Reverse + stringch[a]; // to store the string in reverse
		}

		System.out.println("The reverse of the string is " + Reverse);

		if (str.equals(Reverse)) {

			System.out.println("The given String is Palindrome");
		}

		else

			System.out.println("\n" + "The given String is not a Palindrome");

	}

}
