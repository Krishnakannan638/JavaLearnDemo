package BasicMath;

import java.util.HashMap;
import java.util.HashSet;

public class basicMath {

    public int countDigit(int val) {
        int count = 0;
        while (val != 0) {
            count++;
            val /= 10;
        }
        return count;
    }

    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> map = new HashSet<>();
        for (int nums : arr) {
            if (map.contains(nums)) {
                return true;
            }
            map.add(nums);
        }
        return false;
    }

    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (str.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (!(map1.containsKey(pattern.charAt(i)))) {
                if (!(map2.containsKey(str[i]))) {
                    map2.put(str[i], pattern.charAt(i));
                } else {
                    return false;
                }
                map1.put(pattern.charAt(i), str[i]);
            } else {
                if (map1.get(pattern.charAt(i)).compareTo(str[i]) != 0) {
                    return false;
                }
            }
        }
        return false;
    }
}
