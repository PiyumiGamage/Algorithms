package datastructreTest;

public class insertionSort {

	public static void main(String[] args) {
		int[]numbers= {10,5,9,3,7,2};
     
		sort(numbers);
		printArray(numbers);
	
	}

	
	public static int[]sort(int[]A){
		System.out.print("Unsorted Array: ");
		for(int i=0;i< A.length;i++) {
			
			System.out.print(A[i]+", " );
			
			int key = A[i];
			int j = i-1;
			
			
			while(j>=0 && A[j]>key) {
				A[j+1]=A[j];
				j--;
			}
		
		   A[j+1]=key;
		}
		
		return A;
	}

	
	public static void printArray(int[]A) {
		System.out.print("\nSorted Array: ");
		for(int i=0; i<A.length;i++) {
			System.out.print(A[i]+", ");
		}
	}
}
