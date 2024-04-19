import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rakamları Toplamı Hesaplanacak Sayıyı Hesapla:");
        int sayi= scanner.nextInt();
        int btoplam=0;
        while (sayi != 0) {
            int x = sayi % 10;
            btoplam = x + btoplam;
            sayi = sayi / 10;
        }
        System.out.println("Rakamlar Toplamı="+btoplam);
    }
}
