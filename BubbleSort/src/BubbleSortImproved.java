public class BubbleSortImproved {

	static int[] arrayOfElem1 = { 1,2,9, 3, 4, 5, 6, 7,8 };

	public static void getBubbleSort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			System.out.println("Outer loop executed:" + i);
			boolean is_sorted = true;

			for (int j = 0; j < a.length - i; j++) { // skip the already sorted
														// largest elements
				System.out.println("inner loop executed:" + j);

				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					is_sorted = false;
				}
			}

			if (is_sorted)
				return;
		}
	}

	public static void main(String[] args) {

		getBubbleSort(arrayOfElem1);

		for (int i = 0; i <=arrayOfElem1.length-1; i++) {

			System.out.println(arrayOfElem1[i]);
		}
		
	}

}
