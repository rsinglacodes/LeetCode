class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] pt = path.split("/");
        
        for(String s:pt){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s);
            }
        }

        StringBuilder res = new StringBuilder();
        for(String f:stack){
            res.append("/");
            res.append(f);
        }
        if(res.length()==0){
            return "/";
        }

        return res.toString();
    }
}