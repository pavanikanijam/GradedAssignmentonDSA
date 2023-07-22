lass Palindrome {
    public String L_Palindrome(String str) {

        int first =0,last=0;
        for(int i=0;i<str.length();i++){
            
            int length1= extendPel(str,i,i);
            int length2=extendPel(str,i,i+1);
            int length =Math.max(length1,length2);
            if(length>(last-first)+1){   
                first=i-(length-1)/2;
                last=i+length/2;
            }
        }
        return str.substring(first,last+1);
    }
    int extend(String str,int i,int j){
        while(i>=0 && j<str.length() && str.charAt(i)==str.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;  
                      
    }
}
