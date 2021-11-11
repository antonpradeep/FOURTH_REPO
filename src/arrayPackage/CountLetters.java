package arrayPackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountLetters {

	public static void main(String[] args) {

		String str = "Malayalam";

		String str1 = str.toLowerCase();

		System.out.println("The given string is " + str + "\n");

		char[] stringch = str1.toCharArray();

		System.out.println(stringch);

		for (int a = 0; a < stringch.length; a++) {

			int count = 0;

			for (int b = 0; b < stringch.length; b++) {

				if (stringch[a] == stringch[b]) {

					count++;
				}

			}

			Map<Character, Integer> map = new HashMap<>();

			map.put(stringch[a], count);
			
			for(char s:stringch)
			{

			System.out.println(s);
			}

		}

	}
}
