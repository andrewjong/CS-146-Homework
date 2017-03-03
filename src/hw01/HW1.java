package hw01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrew on 2/7/17.
 */
public class HW1 {

    public static void main(String[] args) {
        char c = 'a';
        String test = "aaa_aaaaaa";
        System.out.println("Occurences of " + c + "in " + test + ": " + countChar(test, c));

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(5);
        ints.add(4);
        ints.add(3);
        ints.add(0);
        ints.add(10);
        System.out.println("Max of " + ints + ": " + recursiveMax(ints));

        System.out.println(recursivePrimeFactors(12));
        System.out.println(recursivePrimeFactors(26));
        System.out.println(recursivePrimeFactors(0));
    }

    // PROBLEM 1
    /* Given a string and a character, find the number of times the character
    * appears in the string. Matches are case-sensitive.
    * Give a recursive implementation.
    */
    public static int countChar(String str, char c) {
        // base case
        if (str.length() <= 0) {
            return 0;
        }
        if (str.charAt(0) == c) {
            return 1 + countChar(str.substring(1, str.length()), c);
        }
        return countChar(str.substring(1, str.length()), c);
    }

    // PROBLEM 2
    /* Find the maximum value in a list of Integers, using recursion.
    *
    * Hint: to keep track of which parts of the list still need to be visited,
    * which works a lot like cleanHotel(int lo, int hi)
    * use a recursive helper function: recursiveMaxHelper(List<Integer> li, int lo, int hi)
    *
    */
    public static int recursiveMax(List<Integer> li) {
        if (li.size() > 1) {
            int currentNum = li.remove(0);
            int nextNum = recursiveMax(li);
            return (currentNum > nextNum) ? currentNum : nextNum;
        }
        // base case
        else {
            return li.remove(0);
        }
    }

    // PROBLEM 3
    /* Return a list of the prime factors of a given integer n, using recursion.
     * Your function should call findAPrimeFactor() to find a single prime factor for you.
     * (We're using it as a building block).
     *
     * You may assume that n is positive.
     */

    public static List<Integer> recursivePrimeFactors(int n) {
        List<Integer> subList = new ArrayList<>();
        // base case
        if (n <= 1) {
            subList.add(n);
            return subList;
        }
        int factor = findAPrimeFactor(n);
        subList.add(factor);
        subList.addAll(recursivePrimeFactors(n / factor));
        return subList;
    }

    /* Return a prime factor of n. */
    public static int findAPrimeFactor(int n) {
        for (int f = 2; f < n; f++)
            if (n % f == 0)
                return f;
        return n;
    }


}
