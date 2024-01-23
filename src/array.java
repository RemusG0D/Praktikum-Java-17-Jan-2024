public class array {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Print the length of the array
        System.out.println("The length of the array is: " + numbers.length);

        // Access and print the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + " is: " + numbers[i]);
        }

        // Modify the elements of the array
        numbers[0] = 10;
        numbers[numbers.length - 1] = 20;

        // Print the modified elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Modified Element " + i + " is: " + numbers[i]);
        }
    }
}