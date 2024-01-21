class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
         int maxLength = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int start = 0, end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                int newStart = charIndexMap.get(currentChar) + 1;
                start = (newStart > start) ? newStart : start;
            }
            int currentLength = end - start + 1;
            maxLength = (currentLength > maxLength) ? currentLength : maxLength;
            charIndexMap.put(currentChar, end);
        }
        return maxLength;
    }
}