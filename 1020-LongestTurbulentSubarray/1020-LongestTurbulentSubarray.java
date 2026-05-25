// Last updated: 5/25/2026, 4:27:52 PM
class Solution {
    public int maxTurbulenceSize(int[] arr) {

        if (arr.length == 1) return 1;

        int[] comp = new int[arr.length - 1];
        int count = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                comp[i] = 1;
            } else if (arr[i] < arr[i + 1]) {
                comp[i] = -1;
            } else {
                comp[i] = 0;
            }
        }

        int l = 0;

        for (int i = 0; i < comp.length; i++) {

            if (comp[i] == 0) {
                l = i + 1;          // hard reset
                count = Math.max(count, 1);
                continue;
            }

            if (i > 0 && comp[i] == comp[i - 1]) {
                l = i;
            }

            count = Math.max(count, i - l + 2);
        }

        return count;
    }
}
