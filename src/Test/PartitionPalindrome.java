package Test;

import java.util.ArrayList;
import java.util.List;

public class PartitionPalindrome {
    public static void main(String[] args) {
        String s = "aac";
        List<List<String>> ans = partition(s);
        for(List<String>temp:ans){
            System.out.println(temp);
        }

    }

    public static List<List<String>> partition(String s) {

        List<List<String>>ans = new ArrayList<>();
        List<String>temp = new ArrayList<>();
        helper(s,ans,temp);
        return ans;

    }
    public static void helper(String given, List<List<String>>ans, List<String> temp){

        if(given.length()==0){
            ans.add(new ArrayList<>(temp));
            return;
        }


        for(int i=0;i<given.length();i++){

            String sub = given.substring(0,i+1);
            String rest = given.substring(i+1);
            if(isPalindrome(sub)){
                temp.add(sub);
                helper(rest,ans,temp);
                temp.remove(temp.size()-1);
            }


        }
        return;


    }


    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            char c = s.charAt(i);
            char d = s.charAt(j);
            if(c!=d) return false;
            i++;j--;
        }

        return true;
    }
}
