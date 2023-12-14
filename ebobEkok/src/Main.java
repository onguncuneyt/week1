import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num1,num2,ekok,ebob;

        System.out.print("1.sayıyı gir : ");
        num1 = inp.nextInt();

        System.out.print("2.sayıyı gir : ");
        num2 = inp.nextInt();

        ekok= (num1 > num2) ? num1 : num2;

        while(true)
        {
            if( ekok % num1 == 0 && ekok % num2 == 0 )
            {
                break;
            }
            ++ekok;
        }
        ebob = (num1*num2)/ekok;

        System.out.println("Ebob : " + ebob + " Ekok : " + ekok);

    }
}