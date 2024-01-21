class Solution {
    public int romanToInt(String s) {
        char[] romanChar = s.toCharArray();
        int value = 0;

        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for (int i = 0; i < romanChar.length; i++) {
            int currentVal = romanMap.get(romanChar[i]);
            if (i < romanChar.length - 1) {
                int nextVal = romanMap.get(romanChar[i + 1]);
                if (nextVal > currentVal) {
                    value += (nextVal - currentVal);
                    i++; 
                    continue;
                }
            }

            value += currentVal;
        }

        return value;
}
}