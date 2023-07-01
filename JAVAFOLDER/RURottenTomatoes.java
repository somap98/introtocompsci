public class RURottenTomatoes {
    public static void main(String[]args){

        int[][] arr = new int[Integer.parseInt(args[0])][Integer.parseInt(args[1])];

        int counter = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) { 
                arr[i][j] = Integer.parseInt(args[2+counter]);
                counter++;
            }
        }
        

        
        int[] sum = new int[Integer.parseInt(args[1])];

        for(int i = 0; i < Integer.parseInt(args[1]); i++) {
            sum[i] = 0;
            for(int j = 0; j < arr.length; j++) {
                sum[i] = sum[i] + arr[j][i];
            }
        }

         int gr = 0;

        for(int i = 0; i < sum.length; i++){
            if(sum[gr] < sum[i]) {
                gr = i;
            }
        } 

        System.out.println(gr); 

        
       
        
    }
    
}


