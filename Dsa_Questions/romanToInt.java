package Dsa_Questions;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public int romantoint(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = romanMap.get(s.charAt(i));
        if (i + 1 < s.length() && value < romanMap.get(s.charAt(i + 1))) {
            result -= value;
        } else {
            result += value;
        }
    }

        return result;
    }
    public static void main(String[] args) {
        romanToInt obj=new romanToInt();
        System.out.println(obj.romantoint("MMMCCXDXLIV"));

    }
}
