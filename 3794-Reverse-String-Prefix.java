class Solution {
    public String reversePrefix(String s, int k) {
        int right = k-1;
        String revs = "";
        char[] c = s.toCharArray();
            
        while(right>=0) {
                revs += c[right];
                right--;
            }
            for (int i=k; i<=s.length()-1;i++) {
                revs += c[i];
            }
        
        return revs;
    }
}