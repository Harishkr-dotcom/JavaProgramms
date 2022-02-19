package Arrays;

public class FindLargestandSmallest {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 80 };
		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			} else if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}

		System.out.println(largest);
		System.out.println(smallest);
	}
}
