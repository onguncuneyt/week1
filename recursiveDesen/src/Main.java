import java.util.Scanner;
public class Main {
    public static void islemYap(int sayi,int ilkDeger,boolean durum) {

        System.out.println("Şu anki değer: " + sayi);

        if (sayi <= 0 && sayi != ilkDeger) {

            // Negatif veya 0 oldu, ancak ilk değerine geri dönmedi
            islemYap(sayi + 5, ilkDeger,true); // 5 ekleyerek devam et
        } else if (sayi == ilkDeger && durum==true) {
            // Negatif veya 0 oldu, ve ilk değerine geri döndü
            System.out.println("İşlem bitti.");
        } else if(sayi>0 && durum==false) {

            // 5 rakamını çıkar
            islemYap(sayi - 5, ilkDeger,false);
        } else if (sayi > 0 && sayi != ilkDeger && durum) {
            islemYap(sayi + 5, ilkDeger,true); // 5 ekleyerek devam et
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi;

        System.out.print("Sayı girin : ");
        sayi = scanner.nextInt();
        islemYap(sayi,sayi,false);

    }
}