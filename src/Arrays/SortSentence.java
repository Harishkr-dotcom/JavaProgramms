package Arrays;

public class SortSentence {
	public static void main(String[] args) {
		//output= Asscending order = am I in Sharp working
		//output= Dessending order = working Sharp in I am 
		String s="I am working in Sharp";
		String[] s1 = s.split(" ");
		String temp="";
		for(int i=0;i<s1.length;i++){
			for(int j=i+1; j<s1.length; j++){
				if(s1[i].compareToIgnoreCase(s1[j])>0){
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		for(int k=0; k<s1.length; k++){
			System.out.print(s1[k]+" ");
		}
		//desending oder
		for(int i=0;i<s1.length;i++){
			for(int j=i+1; j<s1.length; j++){
				if(s1[i].compareToIgnoreCase(s1[j])<0){
					temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}
			}
		}
		for(int k=0; k<s1.length; k++){
			System.out.print(s1[k]+" ");
		}
	}

}
