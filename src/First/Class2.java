package First;

public class Class2 {
	public static void main(String[] args) {
		//print sum of diagonal numbers
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int sum=0;
		int sum1=0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i][i];
		}
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i][a.length-i-1];
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
}
