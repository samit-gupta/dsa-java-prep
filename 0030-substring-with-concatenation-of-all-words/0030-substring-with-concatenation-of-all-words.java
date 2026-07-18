class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
          List<Integer> res = new ArrayList<>();
        if (words.length == 0 || s.length() == 0) return res;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        // Try each offset
        for (int i = 0; i < wordLen; i++) {
            Map<String, Integer> window = new HashMap<>();
            int left = i, count = 0;

            for (int right = i; right + wordLen <= s.length(); right += wordLen) {
                String word = s.substring(right, right + wordLen);

                if (!freq.containsKey(word)) {
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                } else {
                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;

                    while (window.get(word) > freq.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        window.put(leftWord, window.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    if (count == wordCount) {
                        res.add(left);
                    }
                }
            }
        }

        return res;
    }
}