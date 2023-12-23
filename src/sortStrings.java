public class sortStrings {
    public static void selectionSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    /* if array[j].compareTo(array[minIndex] is -1 then array[j] comes BEFORE the string at array[minIndex]
                    if array[j].compareTo(array[minIndex] is 0 then array[j] is EQUAL array[minIndex]
                    if array[j].compareTo(array[minIndex] is 1 then array[j] comes AFTER the string at array[minIndex]
                    */
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the element at index i
            String temp = array[minIndex];
            array[minIndex]= array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        String[] array = {"banana", "apple", "orange", "grape", "kiwi"};

        System.out.println("Original array:");
        printArray(array);
        System.out.println();

        selectionSort(array);
        System.out.println("Array in alphabetical order:");
        printArray(array);
    }
    public static void printArray(String[] array) { // a method to print an array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
