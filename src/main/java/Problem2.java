import java.util.Arrays;

public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        int value1;
        int value2;
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length - 1; i++) {
                value1 = data[i];
                value2 = data[i + 1];
                if (value1 > value2) {
                    data[i] = value2;
                    data[i+1] = value1;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}
