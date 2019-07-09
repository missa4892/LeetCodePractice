/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class StringCompression {
    public static void main(String[] args) {

        String input = "aabcccccaaa";  //"aba" => a1b1a1 => aba

        String compressedWord = compress(input);
        System.out.println(compress(input)); // expected: a2b1c4a3 and count of this word should be less than the actual word

    }

    private static String compress(String input){

        String originalVal = input;

        int countOfOriginal = input.length();

        StringBuilder result = new StringBuilder();


        char previous = input.charAt(0);
        int counter = 1;
        input = input.substring(1, countOfOriginal);

        for (char character : input.toCharArray()){
            if(character == previous){
                counter++;
            } else {
                result.append(previous + "" + counter);
                previous = character;
                counter = 1;
            }
        }
        result.append(previous + "" + counter);

        int newCount = result.length();

        if(countOfOriginal <= newCount){
            return originalVal;
        }

        return result.toString();
    }
}
