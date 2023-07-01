/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {

        long number = Long.parseLong(args[0]);

        String x = Long.toString(number);

        long[] arr = new long[x.length()+1];

        long sum = 0;

        for(int i = 0; i<=x.length(); i++){

            arr[i] = number%10;

            number = number/10;
            
            if(i%2 == 0){
                sum = sum + arr[i];
            }


        }

        long fLast = sum%10;

       //  System.out.println(fLast);

        long sum2 = 0;

        for(int i = 1; i<=x.length(); i++){

            
            if(i%2 == 1){
                sum2 = sum2 + arr[i];
            }


        }

        long sLast = (3*(sum2%10))%10;

        long sumOfAll = fLast + sLast;

       System.out.println(sumOfAll%10);

    }
}