import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin Eleman Sayısını Giriniz: ");
        int elemans= input.nextInt();
        int dizi[]=new int[elemans];
        int toplam=0;
        for (int i=0;i<elemans;i++){
            System.out.print("Dizinin "+(i+1)+".Elemanını Giriniz:");
            dizi[i]= input.nextInt();
            toplam=toplam+dizi[i];
        }
        System.out.print("Dizinin Eleman Toplamı: "+toplam);
        int ortalama=toplam/(elemans);
        System.out.print("\nDizinin Ortalaması: "+ortalama);
    }
}
