package Test;

import java.util.HashMap;
import java.util.Map;

public class AllPalindromicPermutation {
    public static void main(String[] args) {
        String s = "aabcb";
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int len = 0;
        int oddWord = 0;
        Character odd = null;
        for(char c :map.keySet()){
            int count = map.get(c);
            if(count%2==1){
                odd = c;
                oddWord++;
            }
            map.put(c,count/2);
            len+=count/2;
        }
        if(oddWord>1) System.out.println(-1);
        helper(1,len,odd,map,"");

    }

    private static void helper(int curr, int len,Character odd, HashMap<Character, Integer> map, String s) {

        if(curr>len){
            String rev="";
            for(int k = s.length()-1;k>=0;k--){
                rev+=s.charAt(k);
            }
            String res = s;
            if(odd!=null){
                res+=odd;
            }
            res+=rev;
            System.out.println(res);
            return;

        }
        for(char c:map.keySet()) {
            int temp = map.get(c);
            if (temp > 0) {
                map.put(c, temp - 1);
                helper(curr + 1, len, odd, map, s + c);
                map.put(c, temp + 1);
            }
        }
    }
}
