public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        int searchValue = 7; //Value to look for
        int endValue = -1; //Output
        int[] list = {1, 3, 6, 8, 9};
        for (int i = list.length - 1; i > 0; i--) {
            if (searchValue == list[i]) {
                endValue = i;
            }
        }
        return endValue; //Return statement
    }
}