public class TwoStringsToFormPalindrome {

//    static int splitPalindrome(String a, String b){
//
//        int splitIndex = 1;
//
//        if (a.charAt(0) != b.charAt(b.length() - 1)) return -1;
//
//        while(splitIndex < a.length()) {
//            String temp = a.substring(0, splitIndex) + b.substring(splitIndex, b.length());
//            if(isPalindrome(temp)) return splitIndex;
//            splitIndex++;
//        }
//
//        return -1;
//    }

    static int splitPalindrome(String a, String b){

        int strLength = a.length();
        int splitIndex = 0;

        while (a.charAt(splitIndex) == b.charAt(strLength - 1 - splitIndex)) splitIndex++;

        if (splitIndex >= strLength / 2){
            return strLength / 2;
        } else if (isPalindrome(a.substring(splitIndex, strLength - splitIndex))) {
            return strLength - splitIndex;
        } else if (isPalindrome(b.substring(splitIndex, strLength - splitIndex))){
            return splitIndex;
        } else {
            return -1;
        }
    }

    private static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString().equalsIgnoreCase(s);
    }
}
