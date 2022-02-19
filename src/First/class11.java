package First;

public class class11 {
	public static void main(String[] args) {
		String s=" I am  Harish ";
		String n = s.trim();
		String[] a = s.split(" ");
		for(int i=0;i<a.length;i++){
			if(!a[i].trim().isEmpty()){
				System.out.print(a[i]+" ");
			}
		}
		
	}
}
