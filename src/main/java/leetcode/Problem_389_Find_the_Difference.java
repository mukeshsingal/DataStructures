package leetcode;

public class Problem_389_Find_the_Difference {

    public char findTheDifference(String s, String t) {
        char x = 0;
        for(int i = 0; i < s.length();i++) {
            x ^= s.charAt(i);
        }
        for(int i = 0; i < t.length();i++) {
            x ^= t.charAt(i);
        }
        return x;
    }
}