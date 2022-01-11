package praktikum;
import java.util.Scanner;

public class PertemuanSatu07363 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int jumlah07363;
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlah07363 = scan.nextInt();
        String nama07363[]= new String [jumlah07363];
        int nilai07363[]= new int [jumlah07363];
        double rata07363=0;
        int i07363=0;
        scan.nextLine();
        do
        {
            System.out.print("Masukkan nama mata kuliah: ");
            nama07363[i07363] = scan.nextLine();
            System.out.print("Masukkan nilai mata kuliah: ");
            nilai07363[i07363] = scan.nextInt();
            scan.nextLine();
            i07363++;
        }
        while(i07363<jumlah07363);
                
        for(i07363=0;i07363<jumlah07363;i07363++)
        {
            rata07363=rata07363+nilai07363[i07363];
        }
        rata07363=rata07363/jumlah07363;
               
        if(rata07363<70)
        {
            System.out.println(rata07363+" GUGUR");
        }
        else if(rata07363>71)
        {
            System.out.println(rata07363+" LULUS");
        }         
    }
}
