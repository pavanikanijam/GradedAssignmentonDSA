import java.util.*;
class Solution{
    
    public static void main(String []argh)
    {
        Scanner sn1 = new Scanner(System.in);
        while (sn1.hasNext()) {
            String val = sn1.next();
            //Complete the code
            int len2 = val.length();
            if (len2 == 0) {
                System.out.println("true");
                
            } else if (len2 % 2 != 0) {
                System.out.println("false");
                
            } else {
                Stack<Character> stack = new Stack();
                char cn1,temp,i;
                for (i = 0; i < len2; i++) {
                    cn1 = val.charAt(i);
                    if(cn1=='[' || cn1=='{' || cn1=='('){
                        stack.push(cn1);
                    }
                    else {
                        if(stack.isEmpty()) {
                            break;
                        }
                        else {
                            temp=stack.peek();
                            if(cn1==']'&&temp=='['||cn1=='}'&&temp=='{'||cn1==')'&&temp=='(' ){
                                stack.pop();
                            }
                            else {
                                break;
                            }
                        }
                    }
                }
                if(stack.isEmpty() && i==len2) 
                    System.out.println("true"); 
                else 
                    System.out.println("false");
                
            }
        }
    }       
}


