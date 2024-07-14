class Solution {
  public void sortColors(int[] nums) {
    int l = 0, m = 0, h = nums.length - 1;
    while (m <= h) {
      if (nums[m] == 0) {
        int t = nums[m];
        nums[m] = nums[l];
        nums[l] = t;
        l++;
        m++;
      } else if (nums[m] == 1) {
        m++;
      } else {
        int t = nums[m];
        nums[m] = nums[h];
        nums[h] = t;
        h--;
      }
    }

  }
}