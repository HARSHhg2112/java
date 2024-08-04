public class subarraysumzero {

    public static void findSubarrays(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    printSubarray(arr, i, j);
                }
            }
        }
    }

    private static void printSubarray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 2, -1, 1, -2, -3};
        findSubarrays(arr);
    }
}