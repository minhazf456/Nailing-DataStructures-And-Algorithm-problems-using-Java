package ArraysAndString;

import java.util.Arrays;



/**//*recursive approach*//**/
//public class ArraysAndString.fibonacci {
//
//    public static  int fib(int n) {
//        if (n <= 2) return 1;
//        else return fib(n - 1) + fib(n - 2);
//    }
//    public static void main (String [] args){
//        int n =5;
//        System.out.println(fib(5));
//    }
//}


/*Algorithm 2 Dynamic Programming Algorithm*/
//public class ArraysAndString.fibonacci {
//
//    public static  int fib(int n) {
//        /*declare an array tp store ArraysAndString.fibonacci numbers*/
//        int f[] = new int [n+1]; /*// 1 extra to handle case, n = 0 */
//        f[1] = f[2] = 1;
//        for (int i = 3; i <= n; i++)
//            f[i] = f[i-1] + f[i-2];
//        return f[n];
//    }
//
//    public static void main (String [] args){
//        int n =5;
//        System.out.println(fib(5));
//    }
//}
/**//*
This is an iterative algorithm (one that uses loops instead of recursion) so we analyze it a little differently than
//*/
///**/we would a recursive algorithm. Basically, we just have to compute for each line, how many times that line is executed, by looking at which loops it's in and how many times each loop is executed.
//Three lines are executed always. The first line in the loop is executed n-1 times (except for n=1) The second line in loop executed n-2 times (except for n=1) so time(n) = n-1 + n-2 + 3 = 2n (except time(1)=4).
//
//As an example for n=45 it takes 90 steps, roughly 10 million times faster than the other program. Even if you don't do this very often this is a big enough difference to notice, so the second algorithm is much better than the first.*/


/*Algorithm 3 Space Complexity*/

public class fibonacci {

    public static  int fib(int n) {
        /*declare an array tp store ArraysAndString.fibonacci numbers*/
        int a = 1; int b = 1;
        for (int i = 3;i<=n ; i ++){
            int c = a + b;
            a = b;
            b = c;
        }
            return b;
        }

    public static void main (String [] args){
        int n =5;
        System.out.println(fib(5));
    }
}
/*Again, we analyze things differently for recursive and iterative programs*/
/*For an iterative program, it's usually just a matter of looking at the variable declarations (and storage allocation calls such as malloc() in C) */
/*For instance, algorithm 2 declares only an array of n numbers. Analysis of recursive program space is more complicated:*/
/*the space used at any time is the total space used by all recursive calls active at that time*/
/*Each recursive call in algorithm 1 takes a constant amount of space: some space for local variables and function arguments*/
/*but also some space for remembering where each call should return to*/
/*The calls active at any one time form a path in the tree we drew earlier*/
/*in which the argument at each node in the path is one or two units smaller than the argument at its parent. The length of any such path can be at most n, so the space needed by the recursive algorithm is again (some constant factor times) n. We abbreviate the "some constant factor times" using "O" notation: O(n).

It turns out that algorithm 2 can be modified to use a much smaller amount of space
Each step through the loop uses only the previous two values of F(n),
so instead of storing these values in an array, we can simply use two variables.
This requires some swapping around of values so that everything stays in the appropriate places:*/

/*Here c represents f[i], b represents f[i-1], and a represents f[i-2].
The two extra assignments after the sum shift those values over in preparation for the next iteration.
This algorithm uses roughly 4n lines to compute F(n), so it is slower than algorithm 2, but uses much less space.*/
