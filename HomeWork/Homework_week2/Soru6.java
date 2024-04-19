import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Palindromik mi değilmi kontrol edilcek sayıyı giriniz:");
        int pali= scanner.nextInt();
        int gs= pali;
        int fake=0;
            while (pali!=0){
               int x= pali%10;
               fake= 10*fake + x;
               pali=pali/10;
            }
        if(gs==fake){
            System.out.println("Sayı Palindormik");
        }
        else{
            System.out.println("Sayı Palindromik Değil");
        }
    }
}
