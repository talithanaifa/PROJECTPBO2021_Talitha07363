package praktikum;
import java.util.Scanner;

public class inputprogram_07363 {
  public static void main(String[] args)
  {
      Scanner scan_tasya= new Scanner(System.in);
      
      System.out.println("INPUT");
      System.out.print("Masukkan Nama: ");
      String nama_tasya = scan_tasya.nextLine();
      System.out.print("Masukkan Umur: ");
      int umur_tasya = scan_tasya.nextInt();
      
      System.out.println("\nOUTPUT");
      System.out.println("Nama : " +nama_tasya);
      System.out.print("Umur : " );
      System.out.println(umur_tasya);
  }
}
