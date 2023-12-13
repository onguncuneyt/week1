import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner class init
        Scanner inp = new Scanner(System.in);

        //variables defined
        int sayi, ussu,sonuc=1;


        //get input from user
        System.out.print("Üssü alınacak sayı : ");
        sayi = inp.nextInt();

        System.out.print("Üs olacak sayı : ");
        ussu = inp.nextInt();

        //for loop for calculate total
        for (int i = 0; i < ussu; i++) {
            sonuc *= sayi;
        }

        System.out.print("Sonuc : " + sonuc);
    }
}