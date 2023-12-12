import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner class nit
        Scanner inp = new Scanner(System.in);

        //variables defined
        int num;

        //get num from user
        System.out.print("Sayi girin : ");
        num = inp.nextInt();

        //with 1 for loop i print all numbers upside down
        for (int i = 4, j = 5; i <= num || j <= num; i *= 4, j *= 5) {

            System.out.println(i + " "+j);
        }
    }
}