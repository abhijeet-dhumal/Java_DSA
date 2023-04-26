package P_08_Sorting.P_05_DivideConquer.AssignmentQuestions;
/*
Approach 1- Brute Force Approach
        Idea: Traverse through the array,and for every
        index,find the number of smaller elements on
        its right side of the array.
        This can be done using a nested loop.
        Sum up the counts for all indexes in the array
        and print the sum.
        ● Traverse through the array from start to end
        ● For every element, find the count of elements
            smaller than the current number up to that
            index using another loop.
        ● Sum up the count of inversion for every index.
        ● Print the count of inversions.

Time complexity - O(n^2)
*/

/*
Approach 2- Modified Merge Sort
    Idea: Suppose the number of inversions in the left half
    and right half of the array(let bein v1 and in v2);
    what kinds of inversions are not accounted for in
    Inv1+Inv2?
    The answer is–the inversions that need to be counted
    during the merge step.
    Therefore,to get the total number of inversions
    that need to be added are the number of inversions
    in the left sub array,right sub array, and merge().

    Basically,for each array element,count all elements
    more than it to its left and add the count to the
    output. This whole magic happens inside the merge
    function of merge sort.
    Let’s consider two sub arrays involved in the merge process

 */
class Q_3_InversionCount{
    public static void main(String[] args) {

    }
}