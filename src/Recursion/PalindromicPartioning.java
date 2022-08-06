package Recursion;

import java.util.ArrayList;
import java.util.List;

import static Test.PartitionPalindrome.helper;

public class PalindromicPartioning {
    public static void main(String[] args) {
        String s = "aabac";
        List<List<String>>ans = new ArrayList();
        List<String>curr = new ArrayList<>();
        StringBuilder builder = new StringBuilder(s);
//        helper(s,ans,curr);
        helper2(s,0,ans,curr);
        for(List<String>a:ans){
            System.out.println(a);
        }

    }
    public static void helper(String s,List<List<String>>ans,List<String>curr){
        if(s.length()==0){
            ans.add(new ArrayList(curr));
            return;
        }

        for(int i = 0;i<s.length();i++){
            String in = s.substring(0,i+1);
            if(isPalin(in)){
                String rest = s.substring(i+1);
                curr.add(in);
                helper(rest,ans,curr);
                curr.remove(curr.size()-1);
            }

        }

    }

    public static void helper2(String s,int index,List<List<String>>ans,List<String>curr){
        if(index==s.length()){
            ans.add(new ArrayList<>(curr));
        }
        for(int j = index;j<s.length();j++){
            if(isPalin2(index,j,s)){
                curr.add(s.substring(index,j+1));
                helper2(s,j+1,ans,curr);
                curr.remove(curr.size()-1);
            }
        }
    }

    public static boolean isPalin2(int start ,int end, String s){
        int i = start;
        int j = end;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalin(String s){
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
