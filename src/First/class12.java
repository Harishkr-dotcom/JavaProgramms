package First;

public class class12 {
	public static void main(String[] args) {
		int [] a = {10,36,98,12};
		int large= a[0];
		for (int i = 0; i < a.length; i++) {
			if(large<a[i]){
				large=a[i];
			}
		}
		System.out.println(large);
	}
}
