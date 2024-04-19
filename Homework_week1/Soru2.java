import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz:");
        double sayi1= scanner.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz:");
        double sayi2= scanner.nextDouble();
        System.out.print("İşlem Türünü Giriniz: + - * / : ");
        scanner.nextLine();//Dummy
        String tür=scanner.nextLine();
        switch (tür){
            case "+":
                System.out.print(sayi1+sayi2);
                break;
            case "-":
                System.out.print(sayi1-sayi2);
                break;
            case "*":
                System.out.print(sayi1*sayi2);
                break;
            case "/":
                System.out.print(sayi1/sayi2);
                break;
            default:
                System.out.println("Geçersiz İşlem Türü Girdiniz Tekrar Deneyiniz.");
                break;
        }


    }
}
