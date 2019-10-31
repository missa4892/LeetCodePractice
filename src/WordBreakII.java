import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class WordBreakII {

    HashMap<Integer, List<String>> map;
    public List<String> wordBreak(String s, List<String> wordDict) {
        map = new HashMap<>();
        return helper(s, s.length(), wordDict);
    }

    private List<String> helper(String s, int end, List<String> wordDict) {
        ArrayList<String> res = new ArrayList<>();
        if(end == 0) return new ArrayList<>(Arrays.asList(""));
        if (map.containsKey(end)) {
            return map.get(end);
        }

        for (int start = 0; start < end; start++) {
            String sub = s.substring(start, end);
            if(wordDict.contains(sub)){
                List<String> tmp = helper(s, start, wordDict);
                for (String str : tmp){
                    res.add(str.length() == 0 ? sub  : str + " " + sub);
                }
            }
        }
        map.put(end, res);
        return res;
    }

    public List<String> canAddSpaces(String s, Set<String> wordDict) {

        ArrayList[] pos = new ArrayList[s.length() + 1];
        pos[0] = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i,j);
                if(wordDict.contains(sub)){
                    if(pos[j] == null){
                        ArrayList<String> list = new ArrayList<String>();
                        list.add(sub);
                        pos[j] = list;
                    }else{
                        pos[j].add(sub);
                    }
                }
            }
        }

        if(pos[s.length()] == null){
            return new ArrayList<>();
        }

        ArrayList<String> result = new ArrayList<>();
        dfs(pos, result, "", s.length());
        return result;
    }

    private void dfs(ArrayList<String> [] pos, ArrayList<String> result, String curr, int i) {
        if(i == 0){
            result.add(curr.trim());
            return;
        }

        if(pos[i] != null){
            for (String s : pos[i]){
                String combined = s + " " + curr;
                dfs(pos, result, combined, i - s.length());
            }
        }
    }
}

