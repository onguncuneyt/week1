import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner class init
        Scanner inp = new Scanner(System.in);

        //variables defined
        int sayi;
        double sonuc=0;

        //get input from user
        System.out.print("Sayıyı gir : ");
        sayi = inp.nextInt();

        for (double i = 1; i <=sayi; i++) {
            sonuc+= (1/i);
        }

        System.out.print("Sonuc : " + sonuc);
    }
}