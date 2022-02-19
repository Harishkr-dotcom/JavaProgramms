package Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int numArray[] = {5,10,15,20,25,30,35,66}; 
	    int key = 15;
	    int n1 = 0;
	    int n3=numArray.length-1; 
	    int n2 = (n1 + n3)/2;  
	    while( n1 <= n3 ){  
	        if ( numArray[n2] < key ){  
	            n1 = n2 + 1;     
	        }else if ( numArray[n2] == key ){ 
	            System.out.println("Element is found at index: " + n2);  
	            break;  
	        }else{  
	            n3 = n2 - 1;  
	        }  
	        n2 = (n1 + n3)/2;  
	   }  
	   if ( n1 > n3 ){  
	      System.out.println("Element is not found!");  
	   }       
	}

}
