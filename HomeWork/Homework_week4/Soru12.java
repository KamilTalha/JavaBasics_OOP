import java.util.Arrays;
import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Diziniz Kaç Elelamanlı:");
        int esayı = input.nextInt();
        int dizi[] = new int[esayı];
        for (int i = 0; i < esayı; i++) {
            System.out.print("Dizinin" + " " + (i + 1) + ".Elemanını Giriniz");
            dizi[i] = input.nextInt();
        }
        int b;
        for(int i=0;i<esayı;i++){
            for(int j=1;j<esayı;j++){
                if(dizi[i]>dizi[j]){
                    b=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=dizi[i];
                }

            }

        }
        System.out.println(dizi);

    }
}