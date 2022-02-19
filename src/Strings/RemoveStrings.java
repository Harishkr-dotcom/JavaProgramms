package Strings;

public class RemoveStrings {
	public static void main(String[] args) {
		 String str = "avbkjd1122klj4 543 af";//output 1669
		 //String str = "abc123def456ghi987";   //output 1566
		 str = str.replaceAll("[^\\d]", " ");
		 str = str.trim();
		 str = str.replaceAll(" +", " ");
		 String[] a = str.split(" ");
		 int sum=0;
		 for(int i=0;i<a.length;i++){
			 int num = Integer.parseInt(a[i]);
			 sum=sum+num;
		 }
		 System.out.println(sum);
	}

}
