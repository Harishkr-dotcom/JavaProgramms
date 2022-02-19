package First;

import java.util.ArrayList;

public class Class1 {
    public static void main(String[] args)
    {
    	int num=30;
    	ArrayList<Integer> arr= new ArrayList<>();
    	for(int i=1;i<=num;i++){
    		int k=i;
    		boolean flag=true;
    		for(int j=2; j<k;j++){
    			if(k%j==0){
    				flag=false;
    			}
    		}
    		if(flag==true){
    			arr.add(k);
			}
		}
    	for(int i=0;i<arr.size();i++){
    		for(int j=i+1;j<arr.size();j++){
    			if(arr.get(i)+arr.get(j)==30 && arr.get(i)==7){
    				System.out.println(arr.get(i)+" "+arr.get(j));
    			}
    		}
    	}
    	
	}
}
