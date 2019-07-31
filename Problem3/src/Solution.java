import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> set = new HashMap<Character, Integer>();
        int res = 0, sum = 0, j = 0;
        boolean f = true;
        for (int i = 0; i < s.length(); i++){
            if(!set.containsKey(s.charAt(i))){
                set.put(s.charAt(i), i);
                sum++;
            }
            else {
                if(sum > res)
                    res = sum;
                sum = 0;
                i = set.get(s.charAt(i));
                set.clear();
            }
        }
        if(sum > res)
            res = sum;
        return res;
    }

    public static void main(String[] args) {
        String str = " ";
        int test = lengthOfLongestSubstring(str);
        System.out.println(test);
    }
}
