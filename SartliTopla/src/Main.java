import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift
        ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        int deger;
        boolean durum= true;
        Scanner giris=new Scanner(System.in);
        do{
            System.out.printf("Sayı giriniz :");
            deger=giris.nextInt();
            if (deger%2==1)break;
            for (int i=0; i<=deger;i++){
                if (i%4==0) System.out.println(i);
            }
        }while(durum);
    }
}
