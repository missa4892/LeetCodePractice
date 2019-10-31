public class PalindromeSubstring {
    public static int countSubstrings(String s){
        String temp = "";
        StringBuffer stf;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                temp = s.substring(i, j);

                stf = new StringBuffer(temp);
                stf.reverse();
                if (stf.toString().compareTo(temp) == 0)
                    count++;
            }
        }
        return count;
    }
}
