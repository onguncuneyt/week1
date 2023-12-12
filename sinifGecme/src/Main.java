import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplam = 0,sayac =0;
        int gecmeNotu = 55;

        System.out.print("Matematik notu: ");
        int matematikNot = scanner.nextInt();
        if (matematikNot >= 0 && matematikNot <= 100) {
            toplam += matematikNot;
            sayac++;
        }

        System.out.print("Fizik notu: ");
        int fizikNot = scanner.nextInt();
        if (fizikNot >= 0 && fizikNot <= 100) {
            toplam += fizikNot;
            sayac++;
        }

        System.out.print("Türkçe notu: ");
        int turkceNot = scanner.nextInt();
        if (turkceNot >= 0 && turkceNot <= 100) {
            toplam += turkceNot;
            sayac++;
        }

        System.out.print("Kimya notu: ");
        int kimyaNot = scanner.nextInt();
        if (kimyaNot >= 0 && kimyaNot <= 100) {
            toplam += kimyaNot;
            sayac++;
        }

        System.out.print("Müzik notu: ");
        int muzikNot = scanner.nextInt();
        if (muzikNot >= 0 && muzikNot <= 100) {
            toplam += muzikNot;
            sayac++;
        }

        if (sayac > 0) {
            double ortalama = (double) toplam / sayac;
            System.out.println("Girilen gecerli notlarin ortalamasi: " + ortalama);

            if (ortalama >= gecmeNotu) {
                System.out.println("Tebrikler, sinifi gectiniz!");
            } else {
                System.out.println("Sinifi gecemediniz.");
            }
    }else {
            System.out.println("Gecerli not yok");
        }
}
}