package Test;

public class Permutation {
    public static void main(String[] args) {
        String s =  "abc";
        helper(s,"");
    }

    public static void helper(String s ,String ans){
        if(s.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            String rest = s.substring(0,i)+s.substring(i+1);
            helper(rest,ans+c);
        }
    }
}
