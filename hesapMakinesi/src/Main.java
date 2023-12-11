import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //init scanner class
        Scanner inp = new Scanner(System.in);

        //variable definition
        int num1,num2,selection;
        double result=0;

        System.out.print("Lutfen 1.sayiyi girin : ");
        num1 = inp.nextInt();

        System.out.print("Lutfen 2.sayiyi girin : ");
        num2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme ");
        System.out.print("Yapacaginiz islemi secin : ");
        selection = inp.nextInt();

        switch (selection){
            case 1: result = num1+num2; break;
            case 2: result = num1-num2; break;
            case 3: result=num1*num2;break;
            case 4:result=(double) num1/num2;break;
            default:System.out.println("Hatali secim");
        }

        System.out.println("Sonuc: " +result);

    }
}