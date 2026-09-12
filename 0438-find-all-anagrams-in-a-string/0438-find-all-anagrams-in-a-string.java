class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        int left=0;
       
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<s.length();i++){

            char ch =s.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);

            if(i-left+1>n){
                char remove = s.charAt(left);

                map2.put(remove,map2.get(remove)-1);

                if(map2.get(remove)==0){
                    map2.remove(remove);
                }
                left++;
            }

            if (i - left + 1 == n && map.equals(map2)) {
                ans.add(left);
            }
            
        }

        return ans;
    }
}