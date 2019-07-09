public class PermutateUnique {
    public static void main(String[] args){
        int[] input = {1, 1, 2};

        System.out.println(permuteUnique(input));
    }

    private static String permuteUnique(int[] input) {
        return "hi";
    }

    /*
        [1] = {1}
        [1, 2] = {1, 2}, {2, 1}
        [1, 2, 3] = {1, 3, 2}, {3, 1, 2}, {1, 2, 3}, {2, 1, 3}, {3, 2, 1}
        [1, 1, 2] =>
        Output:
                [
                  [1,1,2],
                  [1,2,1],
                  [2,1,1]
                ]

     */



//    public List<List<Integer>> permuteUnique(int[] nums) {
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//
//        if(nums==null || nums.length==0) return res;
//
//        boolean[] used = new boolean[nums.length];
//        List<Integer> list = new ArrayList<Integer>();
//        Arrays.sort(nums);
//
//        dfs(nums, used, list, res);
//        return res;
//    }
//
//    public void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res){
//        if(list.size()==nums.length){
//            res.add(new ArrayList<Integer>(list));
//            return;
//        }
//        for(int i=0;i<nums.length;i++){
//            if(used[i]) continue;
//            if(i>0 && nums[i-1] == nums[i] && !used[i-1]) continue;
//            used[i]=true;
//            list.add(nums[i]);
//            dfs(nums,used,list,res);
//            used[i]=false;
//            list.remove(list.size()-1);
//        }
//    }

//    private static Set<List<Integer>> permutateUnique(int[] input) {
//
//        Set<List<Integer>> set = new HashSet<>();
//
//        if(input.length == 1){
//            List<Integer> numbers = new ArrayList<>(input[0]);
//            HashSet<List<Integer>> numberSet = new HashSet<>();
//            numberSet.add(numbers);
//            return numberSet;
//        }
//
//        int first = input[0];
//        int[] remainder = Arrays.copyOfRange(input, 1, input.length);
//        Set<List<Integer>> permutations = permutateUnique(remainder);
//        for (List<Integer> currList : permutations){
//            for (int j = 0; j <= currList.size(); j++) {
//                List<Integer> s = insertNumberAt(currList, first, j);
//                set.add(s);
//            }
//        }
//
//        return set;
//    }
//
//    private static List<Integer> insertNumberAt(List<Integer> currList, int c, int i) {
//        List<Integer> start = currList.subList(0, i);
//        List<Integer> end = currList.subList(i, currList.size() - 1);
//        start.add(c);
//        start.addAll(end);
//        return start;
//    }

}
