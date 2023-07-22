import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int n = in.nextInt();  
        int m = in.nextInt();  
        int val = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int n1 = in.nextInt();
            deque.add(n1);
            set.add(n1);
            if (deque.size() == m) {
                if (set.size() > val) {
                    val = set.size();
                }
                int num = deque.remove();
                if (!deque.contains(num)) set.remove(num);
            }
        }

        in.close();
        System.out.print(val);
    }
}
