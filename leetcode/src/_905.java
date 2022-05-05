public class _905 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = {3,1,2,4};
        int[] nums2 = {3,1,2,4,6,2,5,9,1};
        sortArrayByParity(nums2);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while (i<j){
             if (nums[i] % 2 != 0 ){
                if (nums[j] % 2 == 0){
                    if (i < j){
                        int tmp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = tmp;
                    }
                }else {
                    j--;
                }
             }else {
                 i++;
             }
        }
        return nums;
    }
}
