import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //scanner class init
        Scanner inp = new Scanner(System.in);

        //variables defined
        int mesafe=0,yas=0,yTip=0;
        double fiyat=1;

        //get data from user
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = inp.nextInt();

        System.out.print("Yasi girin : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini girin (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yTip = inp.nextInt();

        //check conditions for iss data correct
        if(mesafe>0 && yas >=0 && (yTip == 1 || yTip == 2)  ){

            //total price calculation before discounts
            fiyat = mesafe * 0.10;

            //if type is 2 its enter here
            if(yTip == 2){
                if(yas<12){
                    fiyat *= 0.5;
                    fiyat *= 0.80;
                } else if (yas >=12 && yas <= 24) {
                    fiyat*=0.90;
                    fiyat *= 0.80;
                }else if(yas >=65){
                    fiyat*=0.70;
                    fiyat *= 0.80;
                }
                fiyat *= 2;
            }else{
                if(yas<12){
                    fiyat *= 0.5;
                } else if (yas >=12 && yas <= 24) {
                    fiyat*=0.90;
                }else if(yas >=65){
                    fiyat*=0.70;
                }
            }
            System.out.print("Toplam fiyat : " + fiyat);

        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}