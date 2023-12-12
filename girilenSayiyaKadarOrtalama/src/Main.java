import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //scanner class init
        Scanner inp = new Scanner(System.in);

        //variables defined
        int sayi,toplam=0,sayac=0;
        double ortalama;

        //get num from user
        System.out.print("Sayi giriniz : ");
        sayi = inp.nextInt();

        //loop with for and mod every single number till
        //number which user input
        for (int i = 1; i <= sayi ; i++) {
            if(i%3==0 && i%4==0){
                toplam += i;
                sayac++;
            }
        }

        ortalama = (double) toplam/sayac;

        System.out.println("Ortalama : " + ortalama);
    }
}