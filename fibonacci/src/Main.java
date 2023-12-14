import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int elemanSayisi,birinciSayi=0,ikinciSayi=1;
        System.out.print("Eleman sayısını girin : ");
        elemanSayisi = inp.nextInt();

        for (int i = 1; i <= elemanSayisi; ++i) {
            System.out.print(birinciSayi + " ");

            int sonrakiSayi = birinciSayi + ikinciSayi;

            birinciSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;


        }


    }
}