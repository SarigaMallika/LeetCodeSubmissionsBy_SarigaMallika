class Solution {
   public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
        return "";
    }
    int commonLength = Integer.MAX_VALUE;
    for (int i = 0; i < strs.length; i++) {
        int currentLength = strs[i].length();
        if (currentLength < commonLength) {
            commonLength = currentLength;
        }
    }
    char[] commonPrefixArray = new char[commonLength];
    for (int i = 0; i < commonLength; i++) {
        char currentChar = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) != currentChar) {
                return new String(commonPrefixArray, 0, i);
            }
        }
        commonPrefixArray[i] = currentChar;
    }
    return new String(commonPrefixArray);
}

        
}