package Week2;
class Solution {
    public int romanToInt(String s) {
        int result = 0, n = 0;
        for (int index = s.length()-1; index >= 0; index--) {
            switch(s.charAt(index)) {
                case 'I': n = 1; break;
                case 'V': n = 5; break;
                case 'X': n = 10; break;
                case 'L': n = 50; break;
                case 'C': n = 100; break;
                case 'D': n = 500; break;
                case 'M': n = 1000; break;
            }
            if (4 * n < result) {
                result -= n;
            }
            else{
                 result += n;
            }
    }
            return result;
    }
}