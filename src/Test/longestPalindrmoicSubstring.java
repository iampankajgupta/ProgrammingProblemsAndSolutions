package Test;

public class longestPalindrmoicSubstring {
    public static void main(String[] args) {
        String s = "cbbd";
        // epxand from the center Technique
        int n = s.length();
        int start=0,end=0;
        int low=0,high=0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<s.length();i++){
            low = i-1;
            high = i;
            int count=0;
            while(low>=0 && high<n && s.charAt(low) == s.charAt(high)){
                count = high-low+1;
                if(count>max){
                    max = count;
                    start = low;
                    end = high;
                }
                low--;
                high++;
            }

            low = i-1;
            high = i+1;
            count= 0;

            while(low>=0 && high<n && s.charAt(low) == s.charAt(high)){
                count = high-low+1;
                if(count>max){
                    max = count;
                    start = low;
                    end = high;
                }
                low--;
                high++;
            }
        }
        System.out.println(s.substring(start,end+1));
    }

}
