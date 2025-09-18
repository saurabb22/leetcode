class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        String[] sortt= new String[str.length];
        for(int i=0; i<str.length; i++){
            char ch[] = str[i].toCharArray();
            Arrays.sort(ch);
            sortt[i] = new String(ch);
        }
        // Implementing hashmap
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        
        // traverse through sort
        for(int i=0; i<sortt.length; i++){
            String key = sortt[i];
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str[i]);
        }
        // adding to my ansList to get all from the hashmap
        ArrayList<List<String>> ans = new ArrayList<>();
        ans.addAll(map.values());
        return ans;
    }
}