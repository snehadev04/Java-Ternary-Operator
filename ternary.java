// This program demonstrates the ternary operator in Java.
class ternary {
    public static void main(String[] args) {
        int n = 20;
        int result = 0;

        // Ternary operation: condition ? expression1 : expression2
        result = (n % 2 == 0) ? 10 : 20;  // If n is even, result is 10, otherwise result is 20

        System.out.println(result);  // Print the result
    }
}
