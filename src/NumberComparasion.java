import java.util.Scanner;

class NumberComparison {
    public void compareAndCalculate(Scanner scanner) {
        System.out.println("Введите первое число (a): ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число (b): ");
        int b = scanner.nextInt();

        scanner.nextLine();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a == b");
        }

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        if (b != 0) {
            System.out.println("a / b = " + (a / b));
        } else {
            System.out.println("Деление на ноль невозможно.");
        }
    }
}