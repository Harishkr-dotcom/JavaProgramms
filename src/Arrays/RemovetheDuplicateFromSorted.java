package Arrays;

public class RemovetheDuplicateFromSorted {

	public static int removeduplicates(int a[], int n) {
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n - 1];

		return j;
	}

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 2, 2 };
		int n = a.length;
		n = removeduplicates(a, n);
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

}
