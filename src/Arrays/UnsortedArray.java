package Arrays;

public class UnsortedArray {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 80, 30 };
		int first = arr[0];
		int second = arr[0];
		int third = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (first < arr[i]) {
				first = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > second && arr[i] < first)
				second = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > third && arr[i] < second) {
				third = arr[i];
			}
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

		
	}
}
