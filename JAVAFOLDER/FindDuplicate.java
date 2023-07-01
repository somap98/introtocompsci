public class FindDuplicate {
    public static void main(String[]args){

        int[] arr = new int[args.length];

        for(int i = 0; i < args.length; i++) {

            arr[i] = Integer.parseInt(args[i]);

        }
        
        int counter = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]) {
                    counter++;
                }
            }
        }

        if(counter > 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
    
}
