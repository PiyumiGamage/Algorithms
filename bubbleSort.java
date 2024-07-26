package datastructreTest;

public class bubbleSort {

	public static void main(String[] args) {
		int arr[]= {32,12,34,56,31,23,1};
		int length=arr.length;
		
		System.out.print("UnSorted array:");
		for(int i=0;i<length;i++)
			System.out.print(arr[i]+ " ");
		
		
		for(int i=0;i<length-1;i++) {
			for(int j=1;j<length-i;j++) {
				if(arr[j-1]> arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}

		
		System.out.print("\n\nSorted array:");
		
		for(int i=0;i<length;i++) {
		
		System.out.print(arr[i]+ " ");
	}

	}
}
