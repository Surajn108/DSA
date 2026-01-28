public class holloTiltedSqinSq {
    //Output
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
    public static void main(String[] args) {
        int n = 5 ;
        int j,i ;
        int low=n-1;
        int high=n;
      
        for(i = 0 ; i < n ; i++){
            for( j =  0 ; j< 2*n ; j++){
                if(j>low && j<high && i!=0){
                    System.out.print(" ");
                }else{
                System.out.print("*");
                }
            }
             low--;
             high++;
            System.out.println();

            //O/P-:
            // **********
            // ***    ***
            // **      **
            // *        *
        }

        
        int space = n-2;

        // high = n-2;

        for(i = 0 ; i <=n-1  ; i++){
            for(int x =0 ; x <=i ; x++){
                System.out.print("*");
            }
            for(int x =2*n-2-1 ; x >=2*i ; x--){
                
                System.out.print(" ");
            }
            for(int x =i ; x >=0 ; x--){
                System.out.print("*");
            }
           
            System.out.println();

            //O/P-:
            // *        *
            // **      **
            // ***    ***
            // ****  ****
            // **********

        }

        
    
}
   
}
