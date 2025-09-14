class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0, j = 0;  // i for child, j for cookie
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { // cookie satisfies the child
                i++;
            }
            j++; // move to next cookie
        }
        return i;
    }
}