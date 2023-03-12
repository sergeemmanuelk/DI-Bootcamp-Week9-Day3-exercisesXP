public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = 8;
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int sumTotal = (n * (n + 1)) / 2;
        int sumArray = 0;
        for (int i = 0; i < n - 1; i++) {
            sumArray += arr[i];
        }
        int missingNumber = sumTotal - sumArray;
        return missingNumber;
    }
}