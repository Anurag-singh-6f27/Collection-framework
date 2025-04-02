package Dsa_Questions;

public class Mergerarr {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         if(m==0){
                System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            }
         int[]arr=new int[nums1.length];
         System.arraycopy(nums1, 0, arr, 0, nums1.length);
         int k=0;
         if(n!=0) {
             for (int i = 0, j = 0; i < m || j < n; ) {
                 if ( i < m && j < n && arr[i] < nums2[j]) {
                     nums1[k] = arr[i];
                     i += 1;
                     k++;
                 } else if ( i < m && j < n  && arr[i] == nums2[j]) {
                     nums1[k] = arr[i];
                     nums1[k + 1] = nums2[j];
                     k += 2;
                     i++;
                     j++;
                 } else if ( i < m && j < n  && arr[i] > nums2[j]) {
                     nums1[k] = nums2[j];
                     k++;
                     j++;
                 } else if (i == m && j < n) {
                     nums1[k] = nums2[j];
                     k++;
                     j++;
                 }
                 if (i < m && j == n) {
                     nums1[k] = arr[i];
                     k++;
                     i++;
                 }

             }
         }
        for(int i:nums1) {
            System.out.print(i+" ");
        }
    }
}
