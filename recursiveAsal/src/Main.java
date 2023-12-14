import java.util.Scanner;

public class Main {
    public static boolean asalMi(int sayi, int bolen) {
        if (sayi < 2) {
            return false;
        }
        if (bolen == sayi) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalMi(sayi, bolen + 1);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print("Sayiyi girin : ");
        num = scanner.nextInt();
        System.out.print(asalMi(num,2) ? num + " sayısı asaldır " : num + " sayısı asal değildir ");

    }
}