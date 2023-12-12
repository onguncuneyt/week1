import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner class init
        Scanner inp = new Scanner(System.in);

        //variables defined
        int num = 0, toplam = 0;

        //infinite loop till user input odd number
        while (true) {
            System.out.println("Sayi girin");
            num = inp.nextInt();
            if (num % 2 == 0 && num % 4 == 0) {
                toplam += num;
            }else {
                System.out.println("Toplam : " + toplam);
                break;
            }
        }
    }
}