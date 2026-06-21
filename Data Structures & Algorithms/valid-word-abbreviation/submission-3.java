class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int n = word.length();
        int m = abbr.length();
        int i = 0, j = 0;

        while (i < n && j < m) {
            char wc = word.charAt(i);
            char ac = abbr.charAt(j);

            if (Character.isLetter(ac)) {
                if (wc != ac) return false;
                i++;
                j++;
            } else {
                // leading zero check
                if (ac == '0') return false;

                int curr = 0;

                while (j < m && Character.isDigit(abbr.charAt(j))) {
                    curr = curr * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                i += curr;
            }
        }

        return i == n && j == m;
    }
}