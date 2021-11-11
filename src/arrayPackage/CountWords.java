package arrayPackage;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {

		String string = "Hello Java java java Hello world";

		String string1 = string.toLowerCase();

		String[] str = string1.split(" ");

		Map<String, Integer> map = new LinkedHashMap<>();

		for (String c : str) {

			if (!map.containsKey(c)) {

				map.put(c, 1);
			}

			else {

				map.put(c, map.get(c) + 1);
			}
		}

		System.out.println(map);
	}

}
