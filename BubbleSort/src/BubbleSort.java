public class BubbleSort {

	public int[] arrayOfElem = { 2, 1, 3, 4, 5, 6, 7, 8, 9 };
	public int[] arrayOfElem1 = { 5, 10, 2, 8, 14, 12, 4,3 };
	/**
	 * Bubble Sort.
	 * 
	 * Step 1: We should take two for loops. 1. For loop, for passes "How many
	 * times we need to execute the sort logic(i.e Inner for loop) 2. Second for
	 * loop for bubble sort logic.(Compare two adjacent elements, if it greater
	 * than to next element just swap it)
	 * 
	 * Step 2: Return the result.
	 * 
	 * Best-case T(C): O(n power 2). (Highly Not-recommended sorting technique )
	 * 
	 * Important note: Outer loop we were executed arrayOfElem.length-1 times not arrayOfElem.length because
	 * when outloop was reached to  arrayOfElem.length-1 passes array list have been sorted already, there is
	 * no point to pass one more for loop. 
	 * @return
	 */
	public int[] doBubbleSort() {
		
		System.out.println("DOBubbleSort Method is invoking....");

		for (int pass = arrayOfElem.length-1; pass >= 0; pass--) {

			System.out.println("Executing outerloop-Pass: " + pass);

			for (int i = 0; i <arrayOfElem.length-1; i++) {
				System.out.println("Inner loop executed:" + i);
				if (arrayOfElem[i] > arrayOfElem[i + 1]) {

					int temp = arrayOfElem[i + 1];
					arrayOfElem[i + 1] = arrayOfElem[i];
					arrayOfElem[i] = temp;

				}
			}
		}

		return arrayOfElem;

	}


	public static void main(String[] args) {

		BubbleSort obj = new BubbleSort();

		/*int[] outPut = obj.doBubbleSort();

		for (int i = 0; i <=outPut.length-1; i++) {

			System.out.println(outPut[i]);
		}*/

		System.out.println("===========================");
		
	    int[] outPut1 = obj.doBubbleSort();

	}
}
