package arrayPackage;

import java.util.ArrayList;
import java.util.List;

public class ColorsArrayList {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<>();

		color.add("Orange");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Red");
		color.add("White");
		color.add("Black");

		System.out.println(color);

		System.out.println("***************************************");

		color.add(0, "Pink"); // to add element in the first position
		color.add(color.size(), "Navy"); // to add element in the last position

		System.out.println(color);

		System.out.println("***************************************");

		System.out.println("CSK " + "Bleed " + color.get(4)); // to get the element from the specified index

		System.out.println("***************************************");

		color.set(0, "Peach"); // to update specific array element by given element.

		System.out.println(color);

		System.out.println("***************************************");

		boolean search = color.contains("Blue"); // to search an element in a array list.

		System.out.println(search);

		if (search == true) {

			System.out.println("\n" + "The searched color is Available");
		}

		else {

			System.out.println("\n" + "The searched color is Not Available");
		}

		System.out.println("***************************************");

		for (int i = color.size() - 1; i >= 0; i--) { // to reverse elements in a array list

			System.out.println(color.get(i));

		}

		System.out.println("***************************************");

		System.out.println(color.subList(3, 6)); // to extract a portion of a array list.

		System.out.println("***************************************");

//		color.clear(); //to empty the array list
//
//		System.out.println(color);

		for (int j = 0; j < color.size(); j++)

		{
			System.out.println(color.get(j)); // to print all the elements of a ArrayList using the position of the
												// elements
		}

		System.out.println("***************************************");

		System.out.println("Before swapping:" + "\n" + color);

		String swap = color.get(2); // to swap the elements in the arraylist

		color.set(2, color.get(0));

		color.set(0, swap);

		System.out.println();

		System.out.println("After Swapping:" + "\n" + color);

	}

}
