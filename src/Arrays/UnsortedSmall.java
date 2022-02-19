package Arrays;

public class UnsortedSmall {

	public static void main(String[] args) {
		int[] arr = { 10, 11, 12, 13, 14, 6, 3, 1 };
		int small = arr[0];
		int sec_Small = arr[0];
		int third_Small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				third_Small = sec_Small;
				sec_Small = small;
				small = arr[i];
			} else if (arr[i] < sec_Small) {
				third_Small = sec_Small;
				sec_Small = arr[i];
			} else if (arr[i] < third_Small) {
				third_Small = arr[i];
			}
		}
		System.out.println(small);
		System.out.println(sec_Small);
		System.out.println(third_Small);
	}

}
