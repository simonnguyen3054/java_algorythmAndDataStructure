package learn_java;

public class ReverseArr {

	public static void main(String[] args) {
		int reversed[] = reverseArr(new int[] {3, 5, 1, 6});
		for(int i = 0; i < reversed.length; i++) {
			System.out.println(reversed[i]);
		}
	}
	
	public static int[] reverseArr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
      return arr;
    }

}
