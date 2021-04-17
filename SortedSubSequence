package arrays;

import java.util.Arrays;

class SortedSubSequence{
    public static void main(String[] args) {
       int[] arr = new int[]{1,2,1,1,3};
       if(arr.length<3)
           System.out.println("NOT POSSIBLE");
       int leftMin[] = new int[arr.length];
       int rightMax[] = new int[arr.length];
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       leftMin[0]=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]<leftMin[i-1]){
               leftMin[i]=arr[i];
           }
           else{
               leftMin[i]=leftMin[i-1];
           }
       }
       rightMax[arr.length-1]=arr[arr.length-1];
       for(int i=arr.length-2;i>=0;i--){
           if(arr[i]>rightMax[i+1]){
               rightMax[i]=arr[i];
           }
           else{
               rightMax[i]=rightMax[i+1];
           }
       }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>leftMin[i] && arr[i]<rightMax[i])
                System.out.println(leftMin[i]+""+arr[i]+""+rightMax[i]);
        }


    }
}
