import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //scanner class init
        Scanner inp = new Scanner(System.in);

        //variables defined
        int sayi,toplam =0;

        //get data from user
        System.out.print("Bir sayı giriniz : ");
        sayi = inp.nextInt();

        //find factors of num
        for (int i = 1; i < sayi ; i++) {

            if(sayi%i == 0){
                toplam += i;
            }

        }
        //check is the sum of the factors equal to the number?
        if(toplam == sayi){
            System.out.println(sayi + " mükemmel sayıdır");
        }else{
            System.out.println(sayi + " mükemmel sayı değildir");
        }

    }
}