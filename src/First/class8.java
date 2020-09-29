package First;

public class class8 {
	static void disp(int n, int k, int l){
		  int curr_term; 
		    curr_term=n; 
		    for (int i = 1; i <= l; i++)  
		    { 
		    	System.out.print(curr_term + ", "); 
		    	curr_term =curr_term - k; 
		    } 
	}
	
	static void disp1(int n1, int k1, int l1){
		 int curr_term; 
		    curr_term=n1; 
		    for (int i = 1; i <= l1; i++)  
		    { 
		    	System.out.print(curr_term + ", "); 
		    	curr_term = k1+curr_term; 
		    } 
	}
	
	public static void main(String[] args) {
		disp(10, 2, 5);
		disp1(0,2,6);	
	}
}
