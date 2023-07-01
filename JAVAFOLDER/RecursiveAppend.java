/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {

        if(n>0){
        return original + appendNTimes(original, n-1);
        }

        return original;
    }

    public static void main (String[] args) {

	StdOut.print(appendNTimes("cat", 1));
    }
}
