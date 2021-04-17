package arrays;

import java.util.Arrays;

public class LeftGreaterRightSmaller {
    public static void main(String[] args) {
        int arr[] = new int[]{2,4,1,3,5,7,11,8,12,14};
        /*for(int i =1;i<arr.length;i++){
            int pivot=arr[i];
            int left = i - 1;
            int right = i + 1;
            while (left >=0 && pivot>arr[left] ){
                left--;
            }
            while ( right<arr.length && pivot<arr[right]){
                right++;
            }
            if(left==-1 && right==arr.length) {
                System.out.println(arr[i]);
                break;
            }
        }

         */
            int[] min = new int[arr.length];
            int[] max = new int[arr.length];
            int big = arr[0];
            int small = arr[arr.length-1];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>big)
                    big=arr[i];
                max[i]=big;
            }
            for(int j = arr.length-1;j>=0;j--)
            {
                if(arr[j]<small)
                    small=arr[j];
                min[j]=small;
            }

            for(int i =0;i<min.length;i++) {
                if (max[i] == min[i] && i != 0 && i != arr.length - 1) {
                    System.out.println(max[i]);
                    break;
                }
            }
    }
}
