public class GCD {
    public static void main(String[] args) {
        int a = 52;
        int b = 10;
        while( a > 0 && b > 0){
            if( a > b){
                a = a % 10 ;
            }else{
                b =b % 10 ;
            }
        }if(a == 0 ){
            System.out.println("GCD is :"+b);
        }if(b == 0){
            System.out.println("GCD is :"+a);
        }

    }
}
