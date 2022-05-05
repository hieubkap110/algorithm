public class _1051 {
    public static void main(String[] args) {

    }

    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] copied = new int[n];
        for (int i = 0; i < n; i++) {
            copied[n] = heights[n];
        }

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i +1; j < n; j++) {
                if (copied[j] < copied[minIndex] ){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int t = copied[i];
                copied[i] = copied[minIndex];
                copied[minIndex] = t;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != copied[i]){
                count++;
            }
        }
        return count;
    }
}
