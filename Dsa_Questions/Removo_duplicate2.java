package Dsa_Questions;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
public class Removo_duplicate2 {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
        if (j < 2) {
            nums[j] = nums[i];
            j++;
        } else if (nums[j - 2] == nums[i]) {
            continue;
        } else {
            nums[j] =nums[i];
            j++;
        }

    }display(nums);
        return j;

    }



    public void display(int[]arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={-1,-1,-1,1,1,2,2,3,3,3,3};
        Removo_duplicate2 r=new Removo_duplicate2();
        int x=r.removeDuplicates(arr);
        System.out.println();
        System.out.println(x);
    }
}
