package smallestElementLargeThanTarget;


public class Solution {
	public static int firstLarge(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}

		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				left = mid;// mid-1 wrong 可能当前找到的就只有一个target元素
			} else if (target < array[mid]) {
				right = mid;// right=mid–1;right已经不是目标元素了，所以移位也不要紧
			} else {
				left = mid;// left = mid + 1; right
			}
		}

		if (array[left] > target) {
			return array[left]; // check array[left] against target
		}
		if (array[right] > target) {
			return array[right];// check array[right] against target
		}
		return -1;// 如果左右都不相等，说明该元素不存在。上一题不需要，因为只要找离target最近的element即可。
	}
}
