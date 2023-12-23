public class sortIntegers {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the element at index i
            int temp = array[maxIndex];
            array[maxIndex]= array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 1, 6};
        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);

        System.out.println("Array in non-increasing order:");
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
