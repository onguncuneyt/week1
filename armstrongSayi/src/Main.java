import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner class init
        Scanner inp = new Scanner(System.in);
        //defined variables
        int sayi, uzunluk, toplam = 0;
        //get input from user
        System.out.print("Sayıyı gir : ");
        sayi = inp.nextInt();
        //calculate how many digit in number which user entered
        uzunluk = (int) (Math.log10(sayi) + 1);
        //loop calculate and sum digits
        for (int i = 0; i < uzunluk; i++) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }

        System.out.print("Toplam : " + toplam);
    }
}