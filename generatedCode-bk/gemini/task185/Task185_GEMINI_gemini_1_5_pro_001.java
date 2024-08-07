package gemini.task185;

public class Task185_GEMINI_gemini_1_5_pro_001 {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m = nums1.length, n = nums2.length;
    if (m > n) return findMedianSortedArrays(nums2, nums1);

    int imin = 0, imax = m, half_len = (m + n + 1) / 2;

    while (imin <= imax) {
      int i = (imin + imax) / 2;
      int j = half_len - i;
      if (i < m && nums2[j - 1] > nums1[i]) {
        imin = i + 1;
      } else if (i > 0 && nums1[i - 1] > nums2[j]) {
        imax = i - 1;
      } else {
        int max_left = (i == 0) ? nums2[j - 1] : Math.max(nums1[i - 1], nums2[j - 1]);
        int max_right = (j == 0) ? nums1[i] : Math.min(nums1[i], nums2[j]);
        //invalid code, fixed
        return (m + n) % 2==1 ? max_left : (max_left + max_right) / 2.0;
      }
    }
    return 0.0;
  }
}