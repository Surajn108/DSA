import java.util.Map;
class romanToInt {
    public int romanToIntFun(String s) {

        Map<Character, Integer> roman = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int total = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            int current = roman.get(s.charAt(i));
            int next = roman.get(s.charAt(i + 1));

            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }

        total += roman.get(s.charAt(s.length() - 1));

        return total;
    }
}