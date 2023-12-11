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

        //formula for leap year is year/100)%4
        if((year/100)%4 == 0){
            System.out.println(year + " " + "bir artik yildir");
        }else{
            System.out.println(year + " " + "bir artik yil degildir");
        }
    }
}