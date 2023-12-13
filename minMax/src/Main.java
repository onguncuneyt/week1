import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, num;

        System.out.println("Kaç tane sayı gireceksiniz? ");
        int n = inp.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen geçerli bir sayı girin.");
            return;
        }
        

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            num = inp.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

    }
}