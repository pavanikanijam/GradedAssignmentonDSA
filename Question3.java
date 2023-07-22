package assessment;
import java.util.HashMap;
import java.util.Map;


public class assignnment1 {
	
	    public static void main(String[] args) {
	        int[] arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20};

	        int Count1 = SingularCount(arrNum);
	        System.out.println("Count of singular socks = " + Count1);
	    }

	    public static int SingularCount(int[] arr) {
	        Map<Integer, Integer> count2 = new HashMap<>();
	        int count3 = 0;

	        for (int sockId : arr) {
	            count2.put(sockId, count2.getOrDefault(sockId, 0) + 1);
	        }

	        for (int count : count2.values()) {
	            if (count % 2 != 0) {
	                count3++;
	            }
	        }

	        return count3;
	    }
	}
/////
at run time
  ///
  import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner sn1 = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int num1 = sn1.nextInt();

        int[] arr1 = new int[num1];
        System.out.println("Enter the array elements (socks IDs):");
        for (int i = 0; i < num1; i++) {
            arr1[i] = sn1.nextInt();
        }

        int Count = SingularCount(arr1);
        System.out.println("Count of singular socks = " + Count);

        sn1.close();
    }

    public static int SingularCount(int[] arr2) {
        Map<Integer, Integer> sock1 = new HashMap<>();
        int Count1 = 0;

        for (int sock2 : arr2) {
            sock1.put(sock2, sock1.getOrDefault(sock2, 0) + 1);
        }

        for (int count3 : sock1.values()) {
            if (count3 % 2 != 0) {
                Count1++;
            }
        }

        return Count1;
    }
}
