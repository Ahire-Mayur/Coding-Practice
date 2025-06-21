class Solution {
    public int maxDepth(String s) {
        char[] chars = s.toCharArray();
        int depth = 0;
        int maxDepth = 0;
        for(int i = 0; i < chars.length - 1 ; i++){
            if(chars[i] == '('){
                depth++;
                maxDepth = Math.max(maxDepth,depth);
            }
            else if(chars[i] == ')'){
                depth--;
            }
        }
        return maxDepth;
    }
}