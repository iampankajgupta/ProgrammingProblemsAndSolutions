package Test;

public class InsertionSort {
    public static void main(String[] args) {
        int[]arr = {5,8,13,3};
        insertion(arr);
        for(int i :arr){
            System.out.print(i+" ");
        }
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


    // another approch to write insertion sort code without swap
    public static void insertion(int[]arr){
        for(int i = 1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }
    }

}