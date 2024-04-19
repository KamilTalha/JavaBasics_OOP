import java.util.Scanner;
//Kamil Talha Gezer 2311502268
public class Soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibbonaci Sayısının Sınırını Belirleyiniz: ");
        int sınır= scanner.nextInt();
        int i=1;
        int j=0;
        System.out.print("1 ");
                for(int k=0; k<sınır-1; k++){
                    int fibo=i+j;
                    System.out.print(fibo+" ");
                    j=i;
                    i=fibo;
                }
    }
}
