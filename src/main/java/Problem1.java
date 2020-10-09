public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        int searchValue = 7; //Value to look for
        int endValue = -1; //Output
        for (int i = data.length - 1; i >= 0; i--) {
            if (target == data[i]) {
                endValue = i;
            }
        }
        return endValue; //Return statement
    }
}