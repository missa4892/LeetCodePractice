public class isTidy {

    public static void main(String[] args) {
        System.out.println(Integer.toString(tidyOf(498)));
    }

    private static boolean isTidyNumber(int number){
        String numStr = Integer.toString(number);
        if(numStr.length() > 1){
            for (int i = 1; i < numStr.length(); i++) {
                if(Character.getNumericValue(numStr.charAt(i)) < Character.getNumericValue(numStr.charAt(i - 1))){
                    return false;
                }
            }
        }
        return true;
    }

    private static int tidyOf(int number){
        if(isTidyNumber(number)) return number;
        number--;
        return tidyOf(number);
    }
}
