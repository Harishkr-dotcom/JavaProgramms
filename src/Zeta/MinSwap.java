package Zeta;

public class MinSwap {
// Driver code
	public static void main(String[] args)
	{
	    /*int arr[] = {2, 1, 5, 6, 3};
	    int k = 3;*/
	    int arr[] = {2, 7, 9, 5, 8, 7, 4, 2};
	    int k = 8;
	  
	    int count = 0;
	    for (int i = 0; i < arr.length; i++){
	    if (arr[i] <= k){
	        count++;
	    	}
	    }
	    int bad = 0;
	    for (int i = 0; i < count; i++){
	    if (arr[i] > k){
	        bad++;
	        }
	    }
	 
	    int i=0, j=count, ans=bad;
	    while(j<arr.length){
	    	if(arr[i]>k){
	    		bad--;
	    	}
	    	if(arr[j]>k){
	    		bad++;
	    	}
	    	ans= Math.min(ans, bad);
	    	i++;
	    	j++;
	    }
	 System.out.println(ans);
	    
	}
}


