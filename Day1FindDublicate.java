/* I/P: {1,2,3,3,2,1,4,5}
 * O/P: {1,2,3}
 * 
 */
package main1;

public class Day1FindDublicate {
	public static void main(String[] args) {
		 int arr[]= {1,2,3,3,2,1,4,5};
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 
					 System.out.println("the dublicate num: "+arr[i]);
				 }
				 
		 }
	}

	}}
