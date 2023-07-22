package assessment;
import java.util.Arrays;
public class solution1 {

	    public static void main(String[] args) {
	        int[] arrNum = {5, 3, 4, 2, 0, 8};

	        try {
	            calculateCumulativeMultiple(arrNum);
	            System.out.println("Output: arrNum = " + Arrays.toString(arrNum));
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

	    public static void calculateCumulativeMultiple(int[] arr) throws ArithmeticException {
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Input array is null or empty.");
	        }

	        int cumulativeMultiple = 1;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 0) {
	                for (int j = i + 1; j < arr.length; j++) {
	                    arr[j] = 0;
	                }
	                break;
	            }
	            cumulativeMultiple *= arr[i];
	            arr[i] = cumulativeMultiple;
	        }
	    }
	}
///////////////
at runtime:
//
package assessment;
import java.util.Scanner;

public class assignnment1 {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	   
	    	System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();

	        int[] arrNum = new int[n];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < n; i++) {
	            arrNum[i] = scanner.nextInt();
	        }
	    }
	    public static void calculateCumulativeMultiple(int[] arr) throws ArithmeticException {
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Input array is null or empty.");
	        }

	        int cumulativeMultiple = 1;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 0) {
	                for (int j = i + 1; j < arr.length; j++) {
	                    arr[j] = 0;
	                }
	                break;
	            }
	            cumulativeMultiple *= arr[i];
	            arr[i] = cumulativeMultiple;
	        }
	    }
	}
