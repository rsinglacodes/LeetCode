class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String cpdomain:cpdomains){
            String[] part = cpdomain.split(" ");
            int c = Integer.parseInt(part[0]);
            String[] domain = part[1].split("\\.");
            StringBuilder sb = new StringBuilder();
           for(int i = domain.length - 1; i >= 0; i--) {
                String ab = domain[i];

                sb.insert(0, ab);
                String s = sb.toString();

                map.put(s, map.getOrDefault(s, 0) + c);

                sb.insert(0, ".");
            }
        }

        List<String> res = new ArrayList<>();
        for(String domain :map.keySet()){
            res.add(map.get(domain)+" "+domain);
        }

        return res;
    }
}