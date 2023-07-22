import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int num,sum=0,c1=0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        int[] array = new int[num];
        for(int i=0;i<num;i++){
            array[i] = s.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            for(int j=i;j<num;j++)
            {
                sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=array[k];
                   
                }
                 if(sum<0)
                 c1++;
            }
        }
        System.out.print(c1);
    }
    
}
