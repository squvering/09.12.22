public class LargestDifference {
    public static int largestDifference(int[] data) {
        int length = data.length - 1;

        while(length > 0) {
            for(int i = 0; i + length < data.length; i++) {
                if (data[i] <= data[i + length])
                    return length;
            }
        }

        return length;

    }
}
