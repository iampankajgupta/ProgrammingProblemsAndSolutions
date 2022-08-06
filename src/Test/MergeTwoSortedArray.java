package Test;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[]nums = {1, 5, 9, 10, 15, 20};
        int[]nums2 = {2,3};
        mergeTwoSortedArray(nums,nums2);
        for(int i :nums){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i :nums2){
            System.out.print(i+" ");
        }
    }

    private static void mergeTwoSortedArray(int[] nums, int[] nums2) {
        // m and n can be to different size
        // m and n can be of same size
        int m = nums.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        if(nums[0]>nums2[0]){
            swap(nums,nums2,0,0);
            insertionSort(nums2);
            i++;
        }while(i<nums.length && j<nums2.length){
            if(nums[i]>nums2[j]){
                swap(nums,nums2,i,j);
                i++;
                if(j+1<n && nums2[j]>nums2[j+1]){
                    insertionSort(nums2);
                }
            }else i++;
        }

    }
    public static void swap(int[]arr,int[] arr2,int i ,int j){
        int temp = arr[i];
        arr[i] = arr2[j];
        arr2[j] = temp;
    }
    private static void insertionSort(int[] arr) {
        for(int i = 1;i<arr.length;i++){
            int j = i-1;
            while(j>=0 && arr[j]>=arr[j+1]){
                //swap j and j+1;
                swap(arr,j,j+1);
                j--;
            }
        }
    }

    public static void swap(int[]arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}