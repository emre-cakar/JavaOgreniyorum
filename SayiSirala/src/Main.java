import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner giris=new Scanner(System.in);

        System.out.printf("Birinci sayıyı giriniz :");
        a=giris.nextInt();
        System.out.printf("İkinci sayıyı giriniz :");
        b=giris.nextInt();
        System.out.printf("Ücüncü sayıyı giriniz :");
        c=giris.nextInt();

        if (b<a && b<c){
            System.out.printf("En kücük deger : "+b);
        }else if(c<a && c<b){
            System.out.printf("En kücük deger : "+c);
        }else{
            System.out.printf("En kücük deger : "+a);
        }

    }
}
