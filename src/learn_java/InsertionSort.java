package learn_java;

public class InsertionSort {

	public static void main(String[] args) {
		int mySortedArr[] = insertionSort(new int[] {2, 1, 5, 14, 4});
		for(int i = 0; i < mySortedArr.length; i++) {
			System.out.println(mySortedArr[i]);
		}
		
	}
	
	public static int[] insertionSort(int [] a) {
	      for(int i = 1; i < a.length; i++) {
	          int element = a[i]; //element we intend to bring to sorted area
	          int j = i - 1; //last index position of the sorted area
	          while (j >= 0 && a[j] > element) {
	            a[j + 1] = a[j];
	            j--;
	          }
	          a[j + 1] = element;

	      }
	       return a;
	    }

}
