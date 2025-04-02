package Dsa_Questions;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[]arr={1,2,2,3,3,3,3,3,4,4,4,4};
        MajorityElement obj=new MajorityElement();
        System.out.println(obj.majorityElement(arr));
    }
}
