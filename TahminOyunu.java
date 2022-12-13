
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class TahminOyunu {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int number= rand.nextInt(100);
       // System.out.println(number);
        Scanner input=new Scanner(System.in);
        int hak=0;
        int select=0;
        int [] selected=new int[5];
        for (int i=0; i<5; i++){
            selected[hak++]=select;
            System.out.print("Tahmininizi giriniz:");
            select=input.nextInt();

            if (select>0 && select<100){
                if(select==number){
                    System.out.println("Tahmininiz doğrudur sayı : "+number);
                   break;
                }
                else {
                    System.out.println("Hatalı sayı girdiniz, Kalan Hakkınız: "+(5-hak));
                    if (select<number){
                        System.out.println(select+" Sayısı gizli sayıdan küçüktür");
                    }
                    else {
                        System.out.println(select+" Sayısı gizli sayıdan büyüktür");
                    }

                }

            }else {
                i--;
                hak--;
                System.out.println("0-100 arası olmalıdır! Kalan hakkınız : "+(5-hak));

            }
            if (hak==5 && number!=select){
                System.out.println("Kaybettiniz, Tahminleriniz : "+ Arrays.toString(selected)+"Gizli Sayı : "+number);
            }
        }

    }
}
