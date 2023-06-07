package in.ineuron.assessment;

import java.util.Scanner;

public class BinarySearchQ7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int[] arr= {1,2,3,6,7,9,10,23,32,45};
		
		int n=arr.length;
		int start=0;
		int end=n-1;
		System.out.println("Enter the element to search....");
		int element=scan.nextInt();
		int ans= binarySearch(start, end, element, arr); 
		if(ans==-1) System.out.println("Element not found");
		System.out.println("Index of the element: "+ans);
		
	}
	
	public static int binarySearch(int start, int end, int element, int[] arr) {
		while(start<=end) {
			int mid= start+(end-start)/2;
			if(arr[mid]==element) {
				System.out.println("Element found.....");
				return mid;
			}else if(element>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			
		}
		return -1;
	}
}
