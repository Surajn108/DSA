class butterflyPattern {

  
    public void PrintButterfly(int n){

        for(int i = 1 ; i <= n; i++){
            for(int j = 1 ; j <= i ;j++){
                System.out.print(" * ");
                
            }
            for(int j = 1 ; j <= 2*(n-i) ; j++){
                System.out.print("   ");
            }
            for(int j = 1 ;  j<= i ; j++){
                System.out.print(" * ");
            }
        
            System.out.println();
        }

        // 2nd Half
        for(int i = n ; i >= 1; i--){
            for(int j = 1 ; j <= i ;j++){
                System.out.print(" * ");
                
            }
            for(int j = 1 ; j <= 2*(n-i) ; j++){
                System.out.print("   ");
            }
            for(int j = 1 ;  j<= i ; j++){
                System.out.print(" * ");
            }
        
            System.out.println();
        }
      

    }


    public void PrintRombus(int n ){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print("   ");
            }
            for(int j = 1 ; j <=n ; j++){
                System.out.print(" * ");
            }

            System.out.println();


    }
    }

    public static void main(String[] args) {
        butterflyPattern obj = new butterflyPattern();
        obj.PrintButterfly(6);
        System.out.println();
        System.out.println();
        
        obj.PrintRombus(7);
        
    }
}