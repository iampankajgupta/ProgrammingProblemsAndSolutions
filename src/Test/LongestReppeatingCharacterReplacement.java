package Test;

import java.util.HashMap;

public class LongestReppeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "";
        int k = 2;
        int ans = helper(s,k);
        System.out.println(ans);
    }

    private static int helper(String s,int k ) {
        HashMap<Character,Integer>map = new HashMap<>();
        int start = 0;
        int maxRepeatChar = 0;
        int ma = 0;
        for(int end = 0;end<s.length();end++){
            char rightChaar = s.charAt(end);
            map.put(rightChaar,map.getOrDefault(rightChaar,0)+1);
            maxRepeatChar = Math.max(maxRepeatChar,map.get(map.get(rightChaar)));

            if(end-start+1-maxRepeatChar>k){
                char leftChar = s.charAt(start);
                map.put(leftChar,map.get(leftChar)-1);
                start++;
            }
        }
        return 0;

    }
}
