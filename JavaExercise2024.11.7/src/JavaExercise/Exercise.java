package JavaExercise;

public class Exercise {
    public static void main(String[] args) {
        String s = "45320";
        Solution solution = new Solution();
        System.out.println(solution.getSmallestString(s));
    }
}

class Solution {
    public String getSmallestString(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int number1 = c - '0';
            if (i == s.length() - 1) {
                return s;
            }
            c = s.charAt(i + 1);
                int number2 = c - '0';
            if (((number1 % 2 == 0 && number2 % 2 == 0) || (number1 % 2 != 0 && number2 % 2 != 0)) && number1 > number2) {
                s = swap(i, s);
                return s;
            }
        }
        return s;
    }

    public String swap(int i, String s) {
        byte[] bytes = s.getBytes();
        byte temp = bytes[i + 1];
        bytes[i + 1] = bytes[i];
        bytes[i] = temp;
        return new String(bytes);

    }
}