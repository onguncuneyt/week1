import java.util.Scanner;

public class Main {
    static int usHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        } else {
            return taban * usHesapla(taban, us - 1);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taban, us, sonuc;

        System.out.print("Taban değeri gir : ");
        taban = scanner.nextInt();

        System.out.print("Üs değeri gir : ");
        us = scanner.nextInt();
        sonuc = usHesapla(taban, us);
        System.out.print("Sonuç : " + sonuc);

    }
}