package Test;

public class MaximumPointFromCards {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,1};
        int k = 3;
        int n = arr.length;
        int ans = hel(arr,0,n-1,k);
        System.out.println(ans);
    }

    private static int hel(int[] arr, int left, int right, int k) {
        if(k==0) return 0;
        if(left>right) return 0;
        int first = arr[left]+hel(arr,left+1,right,k-1);
        int second = arr[right]+hel(arr,left,right-1,k-1);
        return Math.max(first,second);
    }
}
