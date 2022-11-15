package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public int romanToInt(String s) {
        int totalValue = 0;
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        for(int i = s.length() -1; i >= 0; i--){
            if(i != 0){
                if(romanValues.get(s.charAt(i)) > romanValues.get(s.charAt(i-1))){
                    totalValue += (romanValues.get(s.charAt(i)) - romanValues.get(s.charAt(i-1)));
                    i--;
                } else {
                    totalValue += romanValues.get(s.charAt(i));
                }
            } else {
                totalValue += romanValues.get(s.charAt(i));
            }  
        } 
        return totalValue;
    }
}
