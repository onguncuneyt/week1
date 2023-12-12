import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //scanner class init
        Scanner inp = new Scanner(System.in);
        //defined variables
        int temp;

        //get data from user
        System.out.print("Lutfen hava sicakligini girin: ");
        temp = inp.nextInt();

        //if-else logic with given temp by user
        if(temp<5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (temp >= 5 && temp<15) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (temp >= 15 && temp<25) {
            System.out.println("Piknik yapabilirsiniz");
        }else{
            System.out.println("Yuzmeye gidebilirsiniz");
        }
    }
}