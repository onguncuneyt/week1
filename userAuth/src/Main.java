import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //init scanner class
        Scanner inp = new Scanner(System.in);

        //variables
        String userName,pass;
        String selection = null;

        System.out.print("Kullanici adinizi girin : ");
        userName = inp.nextLine();

        System.out.print("Parolanizi girin : ");
        pass = inp.nextLine();

        //checks are username and password correct
        if(userName.equals("patika") && pass.equals("java123")){
            System.out.println("Giris yaptiniz");
        }else {
            System.out.println("Sifre yanlis\nSifirlamak ister misiniz ? y/n");
            selection = inp.next();
        }

        //if user wants to renew password press y button and code step into case "y" section
        switch (selection){
            case "y":
                System.out.print(" Yeni parolayi girin : ");
                String newPass = inp.next();
                System.out.println(  newPass.equals("java123")  ? "Sifre olusturulamadi" : "Sifre olusturuldu");

                break;
            case "n": break;
            default: System.out.println("Gecersiz secim");
        }
    }
}