public class primeNo {

    public static boolean CheckPrime(int x){
        int cnt = 0;
        for(int i = 1 ; i < Math.sqrt(x) ; i++){
            if(i % 2== 0){
                System.out.println(i);
                cnt++;
            }if((x/i)!=i){
                System.out.println(x/i);
                cnt++;
            }
        }if(cnt == 2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       System.out.println(CheckPrime(1));

    }
}
