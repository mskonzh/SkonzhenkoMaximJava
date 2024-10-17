import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberComparison numberComparison = new NumberComparison();
        numberComparison.compareAndCalculate(scanner);

        StringComparison stringComparison = new StringComparison();
        stringComparison.compareStrings(scanner);

        ArrayOperations arrayOperations = new ArrayOperations();
        arrayOperations.processArray();

        scanner.close();
    }
}
