package basic_algo_struct.hash_table;

import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt2("III"));
    }
    
    public static int romanToInt(String s) {
        Map<String, Integer> romanMap = Map.of("I", 1,
                                               "V", 5,
                                               "X", 10,
                                               "L", 50,
                                               "C", 100,
                                               "D", 500,
                                               "M", 1000);
        
        String[] romanDigits = s.split("");
        int result = 0;
        for (int i = 0; i < romanDigits.length; i++) {
            if(romanDigits.length>i+1 && romanMap.get(romanDigits[i]) < romanMap.get(romanDigits[i+1])){
                int tmp = romanMap.get(romanDigits[i+1]) - romanMap.get(romanDigits[i]);
                result+=tmp;
                i+=1;
            }else{
                result+=romanMap.get(romanDigits[i]);
            }
        }
        return result;
    }

    public static int romanToInt2(String s){
        Map<Character, Integer> romanMap = Map.of('I', 1,
                                               'V', 5,
                                               'X', 10,
                                               'L', 50,
                                               'C', 100,
                                               'D', 500,
                                               'M', 1000);
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.length()>i+1 && (romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i+1)))){
                result+=romanMap.get(s.charAt(i+1)) - romanMap.get(s.charAt(i));
                i+=1;
            }else{
                result+=romanMap.get(s.charAt(i));
            }
        }
        return result;
    }
}