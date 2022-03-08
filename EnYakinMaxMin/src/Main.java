import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner giris=new Scanner(System.in);

        int girilenSayi;
        System.out.print("Bir sayı Giriniz : ");
        girilenSayi=giris.nextInt();
        Arrays.sort(list);
        int kucukEnYakin=list[0] ;
        int buyukEnYakin=list[list.length-1];
        for (int i : list){
            if ( i <girilenSayi && i>kucukEnYakin){
                kucukEnYakin=i;
            }
            if ( i >girilenSayi && i<buyukEnYakin){
                buyukEnYakin=i;
            }
        }
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen Sayı : "+ girilenSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + buyukEnYakin);


    }
}
