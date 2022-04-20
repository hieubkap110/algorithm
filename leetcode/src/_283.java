public class _283 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void moveZeroes(int[] a) {
        int n = a.length;
        int curIndex = 0;
        for (int i = 0; i < n; i++){
            if (a[i] != 0){
                a[curIndex] = a[i];
                curIndex++;
            }
        }
        for (;curIndex < n; curIndex++){
            a[curIndex] = 0;
        }
    }
}
