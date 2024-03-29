package Examples;

public class CloneArray1 {

	public static void main(String[] args) {
		
		int arr1[][] = {{1,2,3},{4,5,6}};
		int arr2[][] = arr1;
		int arr3[][] = arr1.clone();
		
		System.out.println("Original array: " + arr1[0][0]);
		System.out.println("Copied array: " + arr2[0][0]);
		System.out.println("Cloned array: " + arr3[0][0]);
		
		arr1[0][0] = 5;
		
		System.out.println("After changing, Original array: " + arr1[0][0]);
		System.out.println("After changing, Copied array: " + arr2[0][0]);
		System.out.println("After changing, Cloned array: " + arr3[0][0]);	
		
	}

}
