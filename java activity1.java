public class DivisionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer (Dividend): ");
            int num1 = sc.nextInt();

            System.out.print("Enter the second integer (Divisor): ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        }

        System.out.println("Program continues successfully...");
        sc.close();
    }
}
