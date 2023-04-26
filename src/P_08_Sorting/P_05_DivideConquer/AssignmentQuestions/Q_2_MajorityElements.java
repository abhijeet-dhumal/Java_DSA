package P_08_Sorting.P_05_DivideConquer.AssignmentQuestions;

/*
Given an array of integers.
Find the Inversion Count in the array. (HARD)
Inversion Count:For an array,inversion count
indicate show far(or close) the array is
from being sorted.
If the array is already sorted then
the inversion count is 0.
If an array is sorted in the reverse order
then the inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion
if a[i] > a[j] and i < j.

    Sample Input 1:
        N = 5, arr[ ] = {2, 4, 1, 3, 5}
    Sample Output 1: 3,
    because it has 3 inversions -(2, 1), (4, 1), (4, 3).

    Sample Input 2:
        N = 5, arr[ ] = {2, 3, 4, 5, 6}
    Sample Output 2: 0,
    because the array is already sorted

    Sample Input 3:
        N = 3, arr[] = {5, 5, 5}
    Sample Output3 :0,
    because all the elements of the array are the
    same & already in a sorted manner.
    (Hint: A sorting algorithm will be used to
    solve this question.)
    Note-This question is important.
        Even if you are not able to come up with
        the approach,please understand the solution.
 */
public class Q_2_MajorityElements {
    /*
    Approach 1- Brute Force Approach
        Idea : Count the number of times each number
        occurs in the array & find the largest count.
        Time complexity - O(n^2)
    */
    public static int majorityElement(int[] nums) {
        int majorityCount=nums.length/2;
        for(int i=0;i<nums.length;i++) {
            int count=0;
            for(int j=0;j<nums.length;j++) {
                if(nums[j] ==nums[i]) {
                    count+=1;
                }
            }if(count>majorityCount) {
                return nums[i];
            }
        }
        return-1;
    }
    public static void main(String args[]) {
        //Approach1
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

        //Approach2
        System.out.println(majorityElementImproved(nums));
    }
    /*
    Approach 2- Divide & Conquer
        Idea:If we know the majority element
        in the left and right halves of an array,
        we can determine which is the global majority
        element in linear time.
        Here,we apply a classical divide & conquer
        approach that recurses on the left and right
        halves of an array until an answer
        can be trivially achieved for a length-1 array.

        Note that because actually passing copies of
        sub arrays costs time and space,
        we instead pass lo and hi indices
        that describe the relevant slice of the
        over all array.
        In this case,the majority element for a length-1
        slice is trivially its only element,
        so there cursions tops there.
        If the current slice is longer than length -1,
        we must combine the answers for the slice's
        left and right halves.
        If they agree on the majority element,
        then the majority element for the overall
        slice is obviously the same[1].
        If they disagree,only one of them can be "right",
        so we need to count the occurrences of the left
        and right majority elements to determine
        which sub slice's answer is globally correct.
        The over all answer for the array is thus the
        majority element between indices 0 and n.

        Time complexity - O(n*logn)


     */

    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int[] nums, int lo, int hi) {
        // base case;
        // the only element in an arrayof size 1 is the majority
        // element.
        if (lo == hi) {
            return nums[lo];
        }

        // recurse on left and right halves of this slice.
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);
        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }
        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);
        return leftCount > rightCount ? left : right;
    }
    public static int majorityElementImproved(int[]nums) {
        return majorityElementRec(nums,0,nums.length-1);
    }
}

//(You can also find this problem at -https://leetcode.com/problems/majority-element/)
