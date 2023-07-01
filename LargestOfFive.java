public class LargestOfFive {
    public static void main(String[]args) {

        int v = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);
        int x = Integer.parseInt(args[2]);
        int y = Integer.parseInt(args[3]);
        int z = Integer.parseInt(args[4]); 

        
        
        
        
        if(v>w && v>x && v>y && v>z) {
            System.out.println(v);
        } else if(w>v && w>x && w>y && w>z)   {
            System.out.println(w);
        } else if(x>v && x>w && x>y && x>z){
            System.out.println(x);
        } else if(y>v && y>w && y>x && y>z) {
            System.out.println(y);
        } else if(z>x && z>w && z>x && z>y) {
            System.out.println(z);
        }

    }
}

