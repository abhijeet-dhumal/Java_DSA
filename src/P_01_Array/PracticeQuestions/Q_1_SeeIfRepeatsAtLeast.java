/*
AssignmentQuestion 1:
Given an integer array nums,
return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
    Input:nums = [1, 2, 3, 1]
    Output:   true

Example 2:
    Input:nums = [1, 2, 3, 4]
    Output:   false

Example 3:
    Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
    Output:   true

Constraints:
• 1 <= nums.lengtth <= 105
• -10^9 <= nums[ i ] <= 10^9

 */

package P_01_Array.PracticeQuestions;

import java.util.HashSet;

public class Q_1_SeeIfRepeatsAtLeast {
    public static void main(String[] args) {
        int[] arr={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicateBrutForce(arr));
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    static boolean containsDuplicateBrutForce(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}