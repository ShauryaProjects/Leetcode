class Solution {
    public int strStr(String haystack, String needle) {
        int lneed = needle.length();
        for(int i =0; i<=haystack.length()-lneed; i++){
            String sub = haystack.substring(i,i+lneed);
            if(sub.equals(needle))
            return i;

            }
            return -1;
        }
    }