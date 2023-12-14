import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int num){
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length() - 1;
        boolean kontrol = true;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                kontrol = false;
                break;
            }
        }
        return kontrol;
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int sayi;

        System.out.print("Sayıyı girin : ");
        sayi = inp.nextInt();

        System.out.println((isPalindrom(sayi))?sayi+" palindromdur " :sayi + " palindrom değildir");

    }
}