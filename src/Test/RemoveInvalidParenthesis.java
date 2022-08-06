package Test;

import java.util.*;

public class RemoveInvalidParenthesis {
    public static void main(String[] args) {
        String s  = ")";
        Queue<String> queue = new LinkedList<>();
        queue.add(s);
        HashSet<String>set = new HashSet<>();
        List<String>ans = new ArrayList<>();
        boolean found = false;
        while(!queue.isEmpty()){
            String current = queue.poll();
            if(isValid(current) && !set.contains(current)){
                ans.add(current);
                set.add(current);
                found = true;
            }
            if(found) continue;
            String curr  = current;
            for(int i = 0;i<curr.length();i++){
                char c = s.charAt(i);
                if(c!='(' && c!=')') continue;
                String left = curr.substring(0,i);
                String right = curr.substring(i+1);
                queue.add(left+right);
            }
        }

        System.out.println(ans);

    }

    private static boolean isValid(String current) {
        int count = 0;
        for(int i = 0;i<current.length();i++){
            char c = current.charAt(i);
            if(c=='(') count++;
            if(c==')') count--;
            if(count<0) return false;
        }
        return count==0;
    }
}
