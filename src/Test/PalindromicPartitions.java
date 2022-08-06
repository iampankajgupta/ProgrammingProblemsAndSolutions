package Test;

public class PalindromicPartitions {
    public static void main(String[] args) {
        String s = "cbbbcc";
        helper(s,"");

    }

    private static void helper(String given, String asf) {
        if(given.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i = 0;i<given.length();i++){
            String temp = given.substring(0,i+1);
            String res = given.substring(i+1);
            if(palindrome(temp)){
                helper(res,asf+"("+temp+")");
            }
        }
        return;
    }

    public static boolean palindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            char c  = s.charAt(i);
            char d = s.charAt(j);
            if(c!=d) return false;
            i++;j--;
        }
        return true;
    }
}

