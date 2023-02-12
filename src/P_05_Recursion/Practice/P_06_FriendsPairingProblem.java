
/*

Given n friends, each one can remain single or can be paired up
with some other friend. Each friend can be paired only once.
Find out the total number of ways in which friends can
remain single or can be paired up.

Examples:

base cases --
n=1  : output = 1 way
n=2  : output = 2 ways =>> a,b ; (a,b)

Input  : n = 3
Output : 4
Explanation:
{1}, {2}, {3} : all single
{1}, {2, 3} : 2 and 3 paired but 1 is single.
{1, 2}, {3} : 1 and 2 are paired but 3 is single.
{1, 3}, {2} : 1 and 3 are paired but 2 is single.
Note that {1, 2} and {2, 1} are considered same.

Mathematical Explanation:
The problem is simplified version of how many ways we can divide n elements into multiple groups.
(here group size will be max of 2 elements).
In case of n = 3, we have only 2 ways to make a group:
    1) all elements are individual(1,1,1)
    2) a pair and individual (2,1)
In case of n = 4, we have 3 ways to form a group:
    1) all elements are individual (1,1,1,1)
    2) 2 individuals and one pair (2,1,1)
    3) 2 separate pairs (2,2)

 */
package P_05_Recursion.Practice;

public class P_06_FriendsPairingProblem {
    static int SingleOrPairsPossible(int n){
        if(n==1){
            return 1;
        } else if (n==2) {
            return 2;
        }

        /*
        //single

        int fnm1 = SingleOrPairsPossible(n-1);

        // pair
        int fnm2 = SingleOrPairsPossible(n-2);
        int PairWays = (n-1) * fnm2;

        int s = fnm1 + PairWays ;
        */
        return SingleOrPairsPossible(n-1) + (n-1)*SingleOrPairsPossible(n-2);

    }
    public static void main(String[] args) {
        //No of ways of n people to be single or paired in party
        int n=6;
        System.out.println("No of ways of " +n+ " people to be single or paired in party : "+SingleOrPairsPossible(n));
    }
}
