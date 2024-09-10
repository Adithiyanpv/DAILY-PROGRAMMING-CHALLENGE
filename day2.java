public class day2 {
    public static int missingNumber(int[] array) {
        int n = array.length + 1; 
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (n * (n + 1)) / 2 - sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4};
        int result = missingNumber(array);
        System.out.println("The missing number is: " + result);
    }
}
