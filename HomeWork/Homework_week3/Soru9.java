import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Asal mı Değilmi Kontrol Edilcek Sayıyı Giriniz:");
        int sayi= scanner.nextInt();
        int btoplam=0;
        for(int i=2;i<=sayi; i++){
                    if(sayi%i==0){
                        btoplam=btoplam+i;
                    }
                    else{}
        }
        if(btoplam==sayi){
            System.out.println("Sayınız Asaldır");
        }else{
            System.out.println("Sayınız Asal Değildir");
        }
    }
}
