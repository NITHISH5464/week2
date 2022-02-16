package week2.day2;

public class duplicatelement {

	public static void main(String[] args) {
		
		 int[] arr= {1,2,3,4,5,9,8,7,6,4,5,3};
		 
		 for(int i=0; i<arr.length; i++) {
		 int count1=1;
		 for(int j=i+1;i<arr.length;j++) {
			 if(arr[i]==arr[j]) {
			 count1++;
		 }
			 if(count1>1) {
				 System.out.println(arr[j]);
		
	}
		 }}}}
