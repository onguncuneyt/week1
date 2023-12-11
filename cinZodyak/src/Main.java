import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int birthYear,mod;
        String zodiac="";

        System.out.print("Dogum yilinizi girin : ");
        birthYear = inp.nextInt();

        mod = birthYear%12;

        if(mod == 0){
            zodiac = "Maymun";
        } else if (mod == 1) {
            zodiac = "Horoz";
        }else if (mod == 2) {
            zodiac = "Kopek";
        }else if (mod == 3) {
            zodiac = "Domuz";
        }else if (mod == 4) {
            zodiac = "Fare";
        }else if (mod == 5) {
            zodiac = "Okuz";
        }else if (mod == 6) {
            zodiac = "Kaplan";
        }else if (mod == 7) {
            zodiac = "Tavsan";
        }else if (mod == 8) {
            zodiac = "Ejderha";
        }else if (mod == 9) {
            zodiac = "Yilan";
        }else if (mod == 10) {
            zodiac = "At";
        }else if (mod == 11) {
            zodiac = "Koyun";
        }

        System.out.println("Cin zodyaginiz : " + zodiac);

    }
}