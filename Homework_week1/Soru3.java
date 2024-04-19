import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Kontrol Edilecek Sayıyı Giriniz: ");
        int sayi= scanner.nextInt();
        if(sayi == 0){
            System.out.print("Sayi 0 olduğu için ne tek ne çift...");
        } else if (sayi%2 ==0) {
            System.out.print("Sayi Çifttir...");
        }else{
            System.out.print("Sayı Tektir...");
        }
    }
}
