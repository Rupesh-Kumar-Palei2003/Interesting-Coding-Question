package AccentureCodingProblem;
/*
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
import java.util.*;
public class MergeSortedArray {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] result = new int[m+n];
            int i=0, j=0, index=0;
            while(i<m && j<n){
                if(nums1[i] <= nums2[j]){
                    result[index++] = nums1[i];
                    i++;
                }
                else{
                    result[index++] = nums2[j];
                    j++;
                }
            }
            while(i < m){
                result[index++] = nums1[i];
                i++;
            }
            while(j < n){
                result[index++] = nums2[j];
                j++;
            }
            nums1 = result.clone();
            System.out.println(Arrays.toString(result));
        }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1, 3, arr2, 3);
    }
}
