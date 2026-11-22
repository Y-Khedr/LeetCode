class Solution {
    public boolean checkString(String s) {
        boolean flag = false;
        //s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b') flag = true;
            if(flag){
                if(s.charAt(i) == 'a') return false;
            }
        }
        return true;
    }
}