public class OneAway {

    public static void main(String[] args) {
        System.out.println(isOneAway("cat", "catii"));
    }
    /*
          bat, bay
          bak, bake
          the, te
          cat, at
     */

    public static boolean isOneAway(String first, String second) {
        int editsCount = 0;
        int firstSize = first.length();
        int secondSize = second.length();

        if (Math.abs(firstSize - secondSize) > 1) {
            return false;
        }

        int i = 0;
        int j = 0;

        while (i < firstSize && j < secondSize) {
            if (first.charAt(i) != second.charAt(j)) {

                if (editsCount == 1) return false;

                if (firstSize > secondSize) {
                    i++;
                } else if (firstSize < secondSize) {
                    j++;
                } else {
                    i++;
                    j++;
                }

                editsCount++;
            } else {
                i++;
                j++;
            }
        }

        if (i < firstSize || j < secondSize) {
            editsCount++;
        }

        if (editsCount == 1) {
            return true;
        }
        return false;
    }


    private static boolean isOneAway1(String first, String second) {

        String temp = second;

        int indexOfCharDiffering = -1;
        int lengthDiff = first.length() - second.length();
        if(lengthDiff == 1){
            for (int i = 0; i < first.length() && indexOfCharDiffering == -1; i++) {
                if(i - temp.length() == 0 || first.charAt(i) != temp.charAt(i)){
                    indexOfCharDiffering = i;
                    temp = insertAtIndex(first.charAt(indexOfCharDiffering), temp, indexOfCharDiffering);
                }
            }
            if (first.equals(temp)){
                return true;
            }
        } else if (lengthDiff == 0){
            for (int i = 0; i < first.length() && indexOfCharDiffering == -1; i++) {
                if(first.charAt(i) != temp.charAt(i)){
                    indexOfCharDiffering = i;
                    temp = replaceAtIndex(first.charAt(indexOfCharDiffering), temp, indexOfCharDiffering);
                }
            }
            if (first.equals(temp)){
                return true;
            }
        } else if (lengthDiff == -1){
            for (int i = 0; i < second.length() && indexOfCharDiffering == -1; i++) {
                if(i - first.length() == 0 || first.charAt(i) != temp.charAt(i)){
                    indexOfCharDiffering = i;
                    temp = removeAtIndex(temp, indexOfCharDiffering);
                }
            }
            if (first.equals(temp)){
                return true;
            }
        }
        return false;
    }

    private static String removeAtIndex(String temp, int indexOfCharDiffering) {
        return temp.substring(0, indexOfCharDiffering) + temp.substring(indexOfCharDiffering + 1);
    }

    private static String replaceAtIndex(char charToBeReplacedWith, String temp, int indexOfCharDiffering) {
        return temp.substring(0, indexOfCharDiffering) + charToBeReplacedWith + temp.substring(indexOfCharDiffering + 1);
    }

    private static String insertAtIndex(char charToInsert, String temp, int indexOfCharDiffering) {
        return temp.substring(0, indexOfCharDiffering) + charToInsert + temp.substring(indexOfCharDiffering);
    }


}
