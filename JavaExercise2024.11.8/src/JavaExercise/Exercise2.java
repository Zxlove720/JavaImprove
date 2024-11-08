package JavaExercise;

public class Exercise2 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4};
        int[] nums2 = {1,3,4};
        System.out.println(Solution2.numberOfPairs(nums1, nums2, 1));
    }
}

class Solution2 {
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int sum = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
