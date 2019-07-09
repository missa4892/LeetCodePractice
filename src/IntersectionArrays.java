import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class IntersectionArrays {

    public static void main(String[] args) {
        List<Integer> x = Arrays.asList(1, 10, 20, 40, 50);
        List<Integer> y = Arrays.asList(2, 5, 8, 20, 50);
        List<Integer> z = Arrays.asList(3, 9, 15, 18, 20);

        System.out.println(getFirstIntersectingItem(x, y, z));
    }

    private static int getFirstIntersectingItem(List<Integer> x, List<Integer> y, List<Integer> z) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < x.size() && j < y.size() && k < z.size()){
            if(Objects.equals(x.get(i), y.get(j)) && Objects.equals(y.get(j), z.get(k))){
                return x.get(i);
            } else if(x.get(i) < y.get(j)){
                i++;
            } else if(y.get(j) < z.get(k)) {
                j++;
            } else {
                k++;
            }
        }
        return -1;
    }
}
