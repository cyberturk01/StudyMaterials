package codingBat;

public class IsEverywhere {

	public static void main(String[] args) {
		// [1, 2, 1, 3, 4]
		int[] nums = { 1, 2, 1, 3 };
		int[] nums2 = { 4, 4, 1, 2, 2 };
		int[] nums3 = { 1, 3, 1, 3, 1, 3, 4, 3, 1, 3, 4, 2, 3 };

		System.out.println(isEverywhere(nums, 1));
		System.out.println(isEverywhere(nums, 2));
		System.out.println(either24(nums2));
		System.out.println(matchUp(nums, nums2));
		System.out.println(haveThree(nums3));
	}

	/**
	 * We'll say that a value is "everywhere" in an array if for every pair of
	 * adjacent elements in the array, at least one of the pair is that value.
	 * Return true if the given value is everywhere in the array.
	 */
	public static boolean isEverywhere(int[] nums, int val) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == val && nums[i + 2] == val) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if the array contains a 2 next to a 2 or
	 * a 4 next to a 4, but not both.
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean either24(int[] nums) {
		boolean num2 = false;
		boolean num4 = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				num2 = true;
			}
			if (nums[i] == 4 && nums[i + 1] == 4) {
				num4 = true;
			}
		}
		if (num2 && num4) {
			return false;
		} else if (!num2 && !num4) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Given arrays nums1 and nums2 of the same length, for every element in nums1,
	 * consider the corresponding element in nums2 (at the same index). Return the
	 * count of the number of times that the two elements differ by 2 or less, but
	 * are not equal.
	 * 
	 * @param nums
	 * @param nums2
	 * @return
	 */
	public static int matchUp(int[] nums, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int tmp = Math.abs(nums[i] - nums2[i]);
			if (tmp <= 2 && tmp > 1) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Given an array of ints, return true if the array contains two 7's next to
	 * each other, or there are two 7's separated by one element, such as with {7,
	 * 1, 7}.
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean has77(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7 && nums[i + 1] == 7) {
				return true;
			}
		}
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 7 && nums[i + 2] == 7) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if there is a 1 in the array with a 2
	 * somewhere later in the array.
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean has12(int[] nums) {
		boolean num1 = false;
		boolean num2 = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 1) {
				num1 = true;
			}
			if (nums[i + 1] == 2) {
				num2 = true;
			}
		}
		if (num1 && num2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Given an array of ints, return true if the array contains either 3 even or 3
	 * odd values all next to each other.
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean modThree(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
				return true;
			}
			if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Given an array of ints, return true if the value 3 appears in the array
	 * exactly 3 times, and no 3's are next to each other.
	 * 
	 * @param nums
	 * @return
	 */
	public static boolean haveThree(int[] nums) {
		int count = 0;
		boolean num3 = false;
		for (int i = 0; i < nums.length - 4; i++) {
			if (nums[i] == 3 && nums[i + 2] == 3 && nums[i + 4] == 3) {
				count++;
				num3 = true;
			}
			if (count > 1) {
				num3 = false;
			}
		}
		return num3;
	}

	/**
	 * Given an array of ints, return true if every 2 that appears in the array is
	 * next to another 2.	 * 
	 * @param nums
	 * @return
	 */
	public static boolean twoTwo(int[] nums) {
		boolean num2=false;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==2 && nums[i+1]==2) {
				num2=true;
			}
			
		}
		return num2;
	}

}
