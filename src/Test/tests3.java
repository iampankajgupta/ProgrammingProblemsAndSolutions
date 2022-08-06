package Test;

import java.util.HashMap;

public class tests3 {
    public static void main(String[] args) {
        String s = "aabbc";
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c  = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        int len = 0;
        Character odd = null;
        int totalOdd = 0;
        for(char c: map.keySet()){
            int count = map.get(c);
            if(count%2!=0){
                odd = c;
                totalOdd++;
            }
            map.put(c,count/2);
            len+=count/2;
        }
        if(totalOdd>1){
            System.out.println(-1);
        }

        helper(1,len,odd,map,"");
    }

    private static void helper(int cur, int len, Character odd, HashMap<Character, Integer> map,String asf) {

        if(cur>len){
            // reverse
            String rev = "";
            for(int i = asf.length()-1;i>=0;i--){
                rev+=asf.charAt(i);
            }
            String result = asf;
            if(odd!=null){
                result+=odd;
            }
            result+=rev;
            System.out.println(result);
            return;
        }

        for(char c :map.keySet()){
            int freq = map.get(c);
            if(freq>0){
                map.put(c,freq-1);
                helper(cur+1,len,odd,map,asf+c);
                map.put(c,freq);
            }
        }
        return;
    }
}
