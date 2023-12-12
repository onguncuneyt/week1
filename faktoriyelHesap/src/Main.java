import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int kumeEleman, grupEleman, kumeGrupFark;
        double n = 1, r = 1, nFarkR = 1;
        double sonuc;

        System.out.print("Lutfen kume eleman sayisini girin : ");
        kumeEleman = inp.nextInt();

        System.out.print("Lutfen grup eleman sayisini girin : ");
        grupEleman = inp.nextInt();

        kumeGrupFark = kumeEleman - grupEleman;

        for (int i = 1; i <= kumeEleman || i <= grupEleman || i <= kumeGrupFark; i++) {

            if (i <= kumeEleman) {
                n *= i;
            }
            if (i <= grupEleman) {
                r *= i;
            }
            if (i <= kumeGrupFark) {
                nFarkR *= i;
            }

        }

        sonuc = n / (r * nFarkR);

        System.out.println("Sonuc : " + (int)sonuc);

    }
}