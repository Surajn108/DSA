public class ExtractDidit {
    public static void main(String[] args) {
        int n = 7789;
        int LastDigit ;
        while(n>0){

            LastDigit = n % 10 ;
            n = n / 10 ;
            System.out.print(LastDigit);
        }
    }

}
