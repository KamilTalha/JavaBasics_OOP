import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Faktoriyeli Hesaplanacak Sayıyı Giriniz:");
        int sayi= scanner.nextInt();
        int fak=1;
                for(int i=1; i<=sayi ; i++){
                    fak=i*fak;
                }
        System.out.println("Sayının Faktoriyeli:"+fak);
    }
}
