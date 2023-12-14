import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num1;
        double num2;

        System.out.print("Tam sayı gir : ");
        num1 = inp.nextInt();

        System.out.print("Ondalıklı sayı gir : ");
        num2 = inp.nextDouble();

        System.out.println((double)num1 + " " + (int)num2);

    }
}