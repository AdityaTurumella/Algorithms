package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class FindMissingNo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,4,6,8};
        HashMap<Integer,Integer> map = new HashMap<>(arr.length+1);
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);
        for(int i=1;i<=arr.length;i++){
            if(map.get(i)==null){
                System.out.println(i+" missing value");
                continue;
            }
            if(map.get(i)>1){
                System.out.println(i+" repeating element");
            }
        }
    }
}
