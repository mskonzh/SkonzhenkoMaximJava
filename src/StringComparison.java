import java.util.Scanner;

class StringComparison {
    public void compareStrings(Scanner scanner) {
        System.out.println("Введите первую строку: ");
        String s1 = scanner.nextLine();

        System.out.println("Введите вторую строку: ");
        String s2 = scanner.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки не идентичны");
        }
    }
}