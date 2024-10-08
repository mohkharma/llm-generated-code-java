package llama3.task175;

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int peak = left;
        left = 0;
        right = peak;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < target) {
                left = mid + 1;
            } else if (mountainArr.get(mid) > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        left = peak;
        right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < target) {
                right = mid - 1;
            } else if (mountainArr.get(mid) > target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}