/*
Question 5 (DSA Sheet #16)
This problem uses List to return the numbers & HashSets to store them.
These are new datastructures that we will study about in  later chapters.
Approach Let us try to understand the problem statement.
The first part of the problem statement is clear,
we are asked to find out all the triplets in the given array
whose sum is equal to zero.
A triplet is nothing but a set of three number set of three numbers of the given array.

For example,
if nums=[1,2,3,4] is the given array,
[1,2,3][2,3,4][1,3,4] etc are its triplets.
What does the condition i != j, i != k, and j != k mean?

It means that we are not allowed to reuse any number from the array
within a triplet.

Example,for the given array nums = [1,2,3,4],
triplets[1,1,1] or [1,1,2] or [1,2,2] etc are not considered valid triplets.
The last condition that we need to consider is that we cannot have duplicate
triplets in ourfinalresult.
Example if[-2,-2,0,2] is the given array,
we can only consider one of   [-2,0,2] from indexes 0, 2,3 and [-2,0,2]
from indexes 1,2,3 in our final result.

BRUTE FORCE - The simple solution to this problem is to find every possible triplet
from the given array, see if its sum is equal to zero and return the result
(ensuring there are no duplicate triplets in the result).

This algorithm involves the following
steps:
    1. Use three loops to generate all possible triplets for the givenarray,
        with each loopvariable keeping track of 1 triplet element each.
    2. Next we calculate the sum for each triplet generated in step 1.
    3. If  the sumis equal to 0 we need to check if it is aunique triplet
        (not already in our result set).
        We can ensure the triplets in our result set are unique by sorting
        the triplets and adding it to a hashmap
        (hashmap overwrites data if  the same value is written to
        the same key multiple times there by eliminating duplicates).
    4. Once we have added all the triplets whose sum is  equal to 0 into thehashmap,
        we iterate through the hashmap and add it to our result array.
    5. Finally we return the result array.

 */

package P_01_Array.PracticeQuestions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Q_04_TripletsOfArrayWhoseSumIs0 {
    public static void main(String[] args) {
        int[] arr={-2,0,2,3,4};
        System.out.println(threeSum(arr));
    }

    static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }
}