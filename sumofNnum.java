public class sumofNnum {
    public static void sumofN(int i , int sum) {
        if(i<1){
            System.out.println(sum);
            return ;
        }
        sumofN(i-1, sum+1);
    }
    public static void main(String[] args) {
        
        int sum = 0;
        int i = 4 ;
        sumofN(i, sum);

    }
}
