import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int n = strs.length;
        for(String word:strs){
            char[] s = word.toCharArray();
            Arrays.sort(s);
            String key = new String(s);

            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
                map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}