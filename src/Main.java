import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Scanner inp=new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz:");
        sayi= inp.nextInt();
        System.out.println("Girdiğiniz sayiya kadar olan ikinin kuvvetleri:");
        for (int i=1;i<=sayi;i*=2){
            System.out.println(i);
        }
         */
        Scanner inp=new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayı giriniz:");
        sayi= inp.nextInt();
        System.out.println("Girdiğiniz sayıya kadar olan dörtün kuvvetleri:");
        for (int i=1;i<=sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("Girdiğiniz sayıya kadar beşin kuvvetleri:");
        for (int j=1;j<=sayi;j*=5){
            System.out.println(j);
        }
    }
}