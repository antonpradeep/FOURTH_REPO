package arrayPackage;

public class ArrayClass {

	public static void main(String[] args) {

		int[][] ary = new int[4][9];

		int[][] arr = { { 0, 1, 2, 3, 4, 5, 7, 6, 8, 9 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
				{ 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 }, { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 } };

		int length = arr.length;

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				if (arr[row][col] < 10) { // if else condition used to print the values below 10 in two digits

					System.out.print("0" + arr[row][col] + " ");
				}

				else

					System.out.print(arr[row][col] + " ");

			}

			System.out.println();

		}

	}

}
