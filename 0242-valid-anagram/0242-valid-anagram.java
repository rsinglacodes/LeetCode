class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()!=t.length()) return false;
        char[] ch = s.toCharArray();
        char[] ah = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ah);
        for(int i=0;i<s.length();i++){
            if(ch[i]!=ah[i]){
                return false;
            }
        }

        return true;
    }
}