import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diziniz Kaç Elelamanlı:");
        int esayı= input.nextInt();
        int dizi[] =new int[esayı];
        for (int i=0;i<esayı;i++){
            System.out.print("Dizinin"+" "+(i+1)+".Elemanını Giriniz");
            dizi[i]=input.nextInt();
        }
        for (int j=esayı-1; j>=0; j--){
            System.out.print(dizi[j]+" ");
        }
    }
}
