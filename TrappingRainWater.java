package arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = new int[]{7,4,0,9};
        int water=0;
        int left=0;
        int right=0;
        for(int i=1;i<arr.length-1;i++){
            left= arr[i];
            for(int j=0;j<i;j++){
                if(arr[j]>left){
                    left=arr[j];
                }
            }
            right=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>right){
                    right=arr[j];
                }
            }
            water+=Math.min(left,right)-arr[i];
        }
        System.out.println("water"+water);
    }
}
