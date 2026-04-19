import java.util.Scanner;
public class hashingIntro {

    public static void hashInt(){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[13];
        System.out.print("Enter the length of Array");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter "+i+" element :");
            arr[i] = sc.nextInt();
        //int arr[]={1,3,2,1,2};
        }

        //precalculation 
        int[] hash = new int[6];

        for(int j = 0; j < 5 ; j++){
            hash[arr[j]] +=1 ;
        }

        System.out.print("Enter the count of number you want to check Frequancy");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.print("Enter the number");
            int nums = sc.nextInt();
            System.out.print("Frequancy of "+nums+" is:");
            System.out.println(hash[nums]);

        }
    }

    public static void hashChar(){
        Scanner sc = new Scanner(System.in);
        //char arr[] = new char[26];
        String s = "abcdefadef";

        //precalculation 
        int[] hash = new int[26];
        for(int j = 0; j < s.length() ; j++){
            hash[s.charAt(j) - 'a'] +=1 ;
        }

        System.out.print("Enter the count of number you want to check Frequancy");
        int q = sc.nextInt();
        while(q > 0){
            System.out.print("Enter the Char ");
            char ch = sc.next().charAt(0);
            System.out.print("Frequancy of "+ch+" is:");
            System.out.println(hash[ch - 'a']);
            q--;

        }
        sc.close();
    }
    public static void main(String[] args) {

        //hashInt();
        hashChar();

        
        
    }
}
