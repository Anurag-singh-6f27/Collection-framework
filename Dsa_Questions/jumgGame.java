package Dsa_Questions;

public class jumgGame {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if(nums[0]>len){
                return true;
        }
        int farthest=0;
        for (int i = 0; i < len; i++) {
            if (i > farthest) {
                return false;
            }
            farthest=Math.max(farthest,i+nums[i]);
            if(farthest>len-1){
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={2,5,0,0};
        jumgGame obj=new jumgGame();
        System.out.println(obj.canJump(arr));
    }
}
