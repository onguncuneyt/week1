import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int day,month;
        String burc = "";

        System.out.print("Dogdugunuz gun : ");
        day = inp.nextInt();

        System.out.print("Dogdugunuz ay : ");
        month = inp.nextInt();

        if((month == 3 && day>=21) || (month == 4 && day<=20)){
            burc = "Koc";
        }else if((month == 4 && day>=21) || (month == 5 && day<=21)){
            burc = "Boga";
        }else if((month == 5 && day>=22) || (month == 6 && day<=22)){
            burc = "Ikizler";
        }else if((month == 6 && day>=23) || (month == 7 && day<=22)){
            burc = "Yengec";
        }else if((month == 7 && day>=23) || (month == 8 && day<=22)){
            burc = "Aslan";
        }else if((month == 8 && day>=23) || (month == 9 && day<=22)){
            burc = "Basak";
        }else if((month == 9 && day>=23) || (month == 10 && day<=22)){
            burc = "Terazi";
        }else if((month == 10 && day>=23) || (month == 11 && day<=21)){
            burc = "Akrep";
        }else if((month == 11 && day>=22) || (month == 12 && day<=21)){
            burc = "Yay";
        }else if((month == 12 && day>=22) || (month == 1 && day<=21)){
            burc = "Oglak";
        }else if((month == 1 && day>=22) || (month == 2 && day<=19)){
            burc = "Kova";
        }else if((month == 2 && day>=20) || (month == 3 && day<=20)){
            burc = "Balik";
        }else{
            System.out.println("Yanlis deger");
        }

        System.out.println("Burcunuz : " + burc);

    }
}