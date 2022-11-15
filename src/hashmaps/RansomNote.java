package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magLetters = new HashMap<>();
        
        for(int i = 0; i < magazine.length(); i++){
            char letter = magazine.charAt(i);
            if(magLetters.containsKey(letter)){
                magLetters.put(letter, magLetters.get(letter) + 1);
            } else { 
                magLetters.put(letter, 1);
            }
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            char letter = ransomNote.charAt(i);
            if(magLetters.containsKey(letter) && magLetters.get(letter) > 0){
                magLetters.put(letter, magLetters.get(letter) - 1);
            } else {
                return false; 
            }
        }
        
        return true;
    }
}
