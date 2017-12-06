import java.util.Scanner;

public class Factorialis {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long y = 1;
        int n;
        System.out.print("Введите целое положительное число N в разумных пределах (до 20): ");
        String input = scanner.nextLine();
        try {
            n = Integer.parseInt(input);
            if (n>20) {
                System.out.println("Неприемлемо! N > 20, результат не влезет в даже в long");
            }
            else{
            if (n >= 1) {
                System.out.print(n + "!=");
                for (int i = 1; i <= n; i++) {
                    y = y * i;
                }
                System.out.print(y);
            } else {
                System.out.println("Неприемлемо! N меньше 1");
            }
            }
        } catch (Throwable s) {
            System.out.println("Неприемлемо! N не целое число");
        }

    }
}
