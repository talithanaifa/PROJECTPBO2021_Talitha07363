package praktikum;
import java.util.Scanner;

public class PengujianSegitiga_07363 {
    public static void main(String[] args)
    {
        int a_tasya, b_tasya, c_tasya;
        Scanner scan_tasya = new Scanner(System.in);
        
        System.out.println("Masukkan ketiga panjang sisi segitiga");
        a_tasya = scan_tasya.nextInt();
        b_tasya = scan_tasya.nextInt();
        c_tasya = scan_tasya.nextInt();
        
        if (Math.pow(c_tasya,2) < Math.pow(a_tasya,2) + Math.pow(b_tasya,2))
        {
           System.out.println("SEGITIGA LANCIP");
        }
        else if (Math.pow(c_tasya,2) > Math.pow(a_tasya,2) + Math.pow(b_tasya,2))
        {
           System.out.println("SEGITIGA TUMPUL");
        }
        else
        {
           System.out.println("SEGITIGA SIKU SIKU");
        }
    }
}
