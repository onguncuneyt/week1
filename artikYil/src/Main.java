import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //scanner class init
        Scanner inp = new Scanner(System.in);

        //variables
        int year;

        //get input from user
        System.out.print("Yil giriniz : ");
        year = inp.nextInt();


        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " Yili artik yildir");
            } else {
                System.out.println(year + " Yili artik yil değildir.");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " Yili artik yildir");

        } else {
            System.out.println(year + " Yili artik yil değildir.");
        }
    }
}