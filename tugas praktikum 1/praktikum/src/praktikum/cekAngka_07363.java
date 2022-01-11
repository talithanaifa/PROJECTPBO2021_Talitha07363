package praktikum;
import java.util.Scanner;

public class cekAngka_07363 {
    public static void main(String[] args)
    {
        Scanner scan_tasya = new Scanner(System.in);
        int angka_tasya;
        
        System.out.println("Masukkan angka: ");
        angka_tasya = scan_tasya.nextInt();
        
        while(angka_tasya>0)
        {
            angka_tasya = angka_tasya-2;
        }
        System.out.println(angka_tasya);
        
        if(angka_tasya == 0)
        {
            System.out.println("GENAP");
        }
        else
        {
            System.out.println("GANJIL");
        }
    }
}
