public class pyramid {
    public static void PrintPyramid(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0  ; j < n-i-1; j++){
                System.out.print("  ");
            }for(int j = 0  ; j < 2*i+1; j++){
                System.out.print("* ");
            }
        }
        for(int i = n ; i > 0 ; i--){
            for(int j = 0  ; j < n-i-1; j++){
                System.out.print("  ");
            }for(int j = 0  ; j < 2*i+1; j++){
                System.out.print("* ");
            }
        }
        System.out.println();
        for(int i = n ; i > 0 ; i--){
            for(int j = 0  ; j < n-i-1; j++){
                System.out.print("  ");
            }for(int j = 0  ; j < 2*i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rotatePyramid(int n){
    //    Output :
    //     * 
    //     *  * 
    //     *  *  * 
    //     *  *  *  * 
    //     *  *  * 
    //     *  * 
    //     * 
       
        for(int i = 1 ; i < 2*n-1 ; i++){
            int stars = i ;
            if(i > n ){ stars = 2*n - i;}
            for(int j = 1 ;  j<stars; j++){
                System.out.print(" * ");
            }
            System.out.println();
            
        }
    }

    public static void Pyramid10(int n){
        int start = 1;
        
        for(int i = 0 ; i <= n ; i++){
            if(i % 2 == 0){
                start = 0 ;
            }else{
                start = 1 ;
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print(start + " ");
                start = 1 - start ;
            }
            System.out.println();
        }
        }

    public static void num2Pyramid(int n){
        for(int i = 1 ; i < n ; i++){
            int space = 2*(n-i)-1;
            for( int j = 1 ; j < n - (space/2)+1; j++){
                System.out.print(j);
            }
            for( int j = 1 ; j < space; j++){
                System.out.print(" ");
            }
            for( int j = n - space/2 ; j >= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void CharPyramid(int n){
        for(int i = 0 ; i < n ; i++){
            for(char ch = 'A' ; ch < 'A' +i ; ch++){
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        } 
    }
    public static void main(String[] args) {
        //Pyramid10(5);
        int n = 5;
        // PrintPyramid(n);
        // rotatePyramid(n);
        //num2Pyramid(4);
        CharPyramid(5);

    }
}
