class Solution {
    public String frequencySort(String s) {
         HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        ArrayList<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)-> b.getValue()-a.getValue());

        String ans="";
        for(Map.Entry<Character,Integer> entry:list){
            char ch = entry.getKey();
            int freq = entry.getValue();

            for(int i=0;i<freq;i++){
                ans+=ch;
            }
        }

        return ans;

    }
}