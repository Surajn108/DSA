public class recursion {

    public static void f(int i ,int n){
        if( i < n){
            return  ;
        }
        System.out.println("Suraj"+i);
       
        f(i-1, n);
    }
    public static void main(String[] args) {
        f( 4, 1);
    }
}
