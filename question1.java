package assessment;
import java.util.Arrays;
public class solution1 {

	    public static void main(String[] args) {
	        int[] arr1 = {5, 3, 4, 2, 0, 8};

	        try {
	            calc(arr1);
	            System.out.println("Output: arrNum = " + Arrays.toString(arr1));
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

	    public static void calc(int[] arr2) throws ArithmeticException {
	        if (arr2 == null || arr2.length == 0) {
	            throw new IllegalArgumentException("Input array is null or empty.");
	        }

	        int Multiple = 1;
	        for (int i = 0; i < arr2.length; i++) {
	            if (arr2[i] == 0) {
	                for (int j = i + 1; j < arr2.length; j++) {
	                    arr2[j] = 0;
	                }
	                break;
	            }
	            Multiple *= arr2[i];
	            arr2[i] =Multiple;
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
	        int num1 = scanner.nextInt();

	        int[] arr1 = new int[num1];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < num1; i++) {
	            arr1[i] = scanner.nextInt();
	        }

	        try {
	            calc(arr1);
	            System.out.println("Output: arrNum = " + Arrays.toString(arr1));
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

	    public static void calc(int[] arr2) throws ArithmeticException {
	        if (arr2 == null || arr2.length == 0) {
	            throw new IllegalArgumentException("Input array is null or empty.");
	        }

	        int Multiple = 1;
	        for (int i = 0; i < arr2.length; i++) {
	            if (arr2[i] == 0) {
	                for (int j = i + 1; j < arr2.length; j++) {
	                    arr2[j] = 0;
	                }
	                break;
	            }
	            Multiple *= arr2[i];
	            arr2[i] =Multiple;
	        }
	    }
	}
