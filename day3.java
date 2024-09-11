import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 1, 3, 4, 2}; 
        int duplicate = solution.findDuplicate(arr);
        System.out.println("Duplicate Number: " + duplicate); 
    }
}
