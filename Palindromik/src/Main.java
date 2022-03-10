import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz :");
        String deger=giris.nextLine();
        int uzunluk= deger.length()/2;
        String durum="Palindrome degerdir.";
        giris.close();
        for(int i=0;i<=uzunluk;i++){
            char deger1=deger.charAt(i);
            char deger2=deger.charAt(deger.length()-i-1);
            if( deger1!=deger2){
                durum="Palindrome değildir.";
                break;
            }

        }
        System.out.println(deger+" - "+durum);
    }
}