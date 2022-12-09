/*
Given n non-negative integers representing an elevation map where the width of each bar is 1,
compute how much water it can trap after raining.

Example 1:
    Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]
    Output:   6
    Explanation:
        The above elevation map (black section) is represented by array
        [0,1,0,2,1,0,1,3,2,1,2,1].
        In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
    Input:height = [4, 2, 0, 3, 2, 5]
    Output:   9
    Constraints:
        •n == height . length
        •1 <= n <= 2 * 104
        •0 <= height [ i ] < = 105
*/

package P_01_Array.PracticeQuestions;

public class Q_3_WaterTrappedByColumns {
    public static void main(String[] args) {
        int[] arr={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(arr));
    }

    static int trap(int[] height) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];
        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }

        }
        return res;
    }
}