package praktikum;
import java.util.Scanner;

public class CekPlatnomor_07363 {
    public static void main(String[] args)
    {
        Scanner scan_tasya = new Scanner(System.in);
        char plat_tasya;
        System.out.print("Masukkan Kode Plat: ");
        
        plat_tasya = scan_tasya.next().charAt(0);
        
            switch(plat_tasya)
            {
                case 'L':
                    System.out.println("Plat Surabaya");
                    break;
                case 'B':
                    System.out.println("Plat Jakarta");
                    break;
                case 'N':
                    System.out.println("Plat Malang");
                    break;
                case 'D':
                    System.out.println("Plat Bandung");
                    break;
                default:
                    System.out.println("Plat tidak dikenal oleh sistem");
            }
    }
}
