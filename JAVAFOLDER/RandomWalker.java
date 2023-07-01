public class RandomWalker {
    public static void main (String[]args) {

        int n = Integer.parseInt(args[0]);


        System.out.println("(0,0)");


        int x = 0;
        int y = 0;
        int rand = 0;

        

        while(n>0) {

            rand = (int)(Math.random()*4);

            if(rand == 0){
                x++;
            } else if(rand == 1) {

                x--;
            } else if(rand == 2) {

                y++;
            } else if(rand == 3) {

                y--;
            }
            
            System.out.println("(" + x + "," + y + ")");

            n--;
        }

        double sqSum = Math.pow(x, 2) + Math.pow(y, 2);

        System.out.println(sqSum);


    }
    
}
