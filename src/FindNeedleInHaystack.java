import java.util.ArrayList;
import java.util.List;

public class FindNeedleInHaystack {

    public static List<Integer> grep(String haystack, String needle) {

        List<Integer> result = new ArrayList<>();

        int needleIndex = 0;
        int haystackIndex = 0;
        int prospectiveIndex = -1;

        while (haystackIndex < haystack.length()) {
            if(haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {
                if(needleIndex == 0) {
                    prospectiveIndex = haystackIndex;
                    haystackIndex++;
                    needleIndex++;
                } else if(needleIndex == needle.length() - 1) {
                    result.add(prospectiveIndex);
                    needleIndex = 0;
                    if(prospectiveIndex > 0 ) {
                        haystackIndex = prospectiveIndex + 1;
                    }
                    prospectiveIndex = -1;
                } else {
                    needleIndex++;
                    haystackIndex++;
                }
            } else {
                if(prospectiveIndex > -1) {
                    haystackIndex = prospectiveIndex + 1;
                } else {
                    haystackIndex++;
                }

                needleIndex = 0;
                prospectiveIndex = -1;
            }
        }
        return result;
    }

}
