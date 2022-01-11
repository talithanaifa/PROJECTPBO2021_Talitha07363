package praktikum;
import java.util.Scanner;

public class DeretKelipatan4_07363 {
    public static void main(String[] args)
    {
        Scanner scan_tasya = new Scanner(System.in);
        int banyak_tasya;
        
        System.out.println("Banyak deret: ");
        banyak_tasya = scan_tasya.nextInt();
        
        int[] deret = new int [banyak_tasya];
        
        for(int i_tasya=0;i_tasya<banyak_tasya;i_tasya++)
        {
            deret[i_tasya]=i_tasya*4+2;
        }
        for(int i_tasya : deret)
        {
            System.out.println(i_tasya);
            System.out.println(" ");
        }
    }
}
