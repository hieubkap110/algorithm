import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _448 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1};
		System.out.println(findDisappearedNumbers(nums));
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		ArrayList<Integer> result = new ArrayList<>();
		boolean[] exist = new boolean[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			exist[nums[i]] = true;
		}
		for (int i = 1; i < nums.length; i++) {
			if (exist[i] == false) {
				result.add(i);
			}
		}
		return result;
	}
}
