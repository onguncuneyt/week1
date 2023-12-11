import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //scanner class
        Scanner inp = new Scanner(System.in);

        //degiskenler
        int a,b,c,sonuc;

        System.out.print("Lutfen 1.sayiyi girin : ");
        a = inp.nextInt();

        System.out.print("Lutfen 2.sayiyi girin : ");
        b = inp.nextInt();

        System.out.print("Lutfen 3.sayiyi girin : ");
        c = inp.nextInt();

        sonuc = a+(b*c)-b;

        System.out.println(sonuc);
    }
}