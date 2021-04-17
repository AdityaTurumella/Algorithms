package arrays;

public class LongestsubarraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,2};
        int sLeft=-1;
        int sRight=-1;
        int left=0;
        int right=0;
        int curSum=0;
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                curSum+=arr[i];
                if(curSum>maxSum || curSum==maxSum && sRight-sLeft<right-left){
                    maxSum=curSum;
                    sLeft=left;
                    sRight=right;
                }
            }
            else{
                left=i+1;
                curSum=0;
            }
            right++;
        }

        for(int i=sLeft;i<=sRight;i++){
            System.out.println(arr[i]);
        }
    }
}
