import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sayi1,sayi2,sayi3;

        System.out.println("1.sayiyi gir : ");
        sayi1 = inp.nextInt();

        System.out.println("2.sayiyi gir : ");
        sayi2 = inp.nextInt();

        System.out.println("3.sayiyi gir : ");
        sayi3 = inp.nextInt();

        if(sayi1 < sayi2 && sayi1 < sayi3){
            if(sayi2<sayi3){
                System.out.println("sayi1<sayi2<sayi3");
            }else{
                System.out.println("sayi1<sayi3<sayi2");
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            if(sayi1<sayi3){
                System.out.println("sayi2<sayi1<sayi3");
            }else{
                System.out.println("sayi2<sayi3<sayi1");
            }
        }else{
            if(sayi1<sayi2){
                System.out.println("sayi3<sayi1<sayi2");
            }else{
                System.out.println("sayi3<sayi2<sayi1");
            }
        }

    }
}