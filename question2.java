package assessment;
import java.util.ArrayList;
import java.util.List;

public class assignnment2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 5, 6, 8, 10, 11, 14};

        System.out.println("Missing numbers in arr1: " + findMissingNumbers(arr1));
        System.out.println("Missing numbers in arr2: " + findMissingNumbers(arr1));
    }

    public static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> missingNum = new ArrayList<>();

        if (arr.length <= 1) {
            return missingNum;
        }

        int Num = arr[0];
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != Num) {
                missingNum.add(Num);
                Num++;
            }
            Num++;
        }

        return missingNum;
    }
}
//////////
run time code
  ////
  import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;;

public class second {

    public static void main(String[] args) {
        Scanner sn1 = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int num1 = sn1.nextInt();

        int[] arr1 = new int[num1];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < num1; i++) {
            arr1[i] = sn1.nextInt();
        }

        List<Integer> missingNum = findMissingNumbers(arr1);
        System.out.println("Missing numbers in the array: " + missingNum);

        sn1.close();
    }

    public static List<Integer> findMissing(int[] arr) {
        List<Integer> num2 = new ArrayList<>();

        if (arr.length <= 1) {
            return missingNum;
        }

        int minNum = arr[0];
        int maxNum = arr[arr.length - 1];

        int[] num4 = new int[maxNumber - minNumber + 1];
        for (int num : arr) {
            num4[num - minNumber] = 1;
        }

        for (int num = minNum; num <= maxNum; num++) {
            if (num4[num - minNum] == 0) {
                missingNum.add(num);
            }
        }

        return missingNum;
    }
}
