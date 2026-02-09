import java.util.Arrays ;
class LCPrefix {


    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        if (strs.length == 0){
            return " ";
        }

        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int index = 0 ;

        while( index < s1.length())
        {

            if(s1.charAt(index) == s2.charAt(index)){
                index++;
            }else{
                break ;
            }

        }
       
       return s1.substring(0 , index);    
    }


    public static void main(String[] args) {
        LCPrefix obj = new LCPrefix();
        String[] strs = {"flower","flow","flight"};
        String result = obj.longestCommonPrefix(strs);
        System.out.println(result);
    }
}