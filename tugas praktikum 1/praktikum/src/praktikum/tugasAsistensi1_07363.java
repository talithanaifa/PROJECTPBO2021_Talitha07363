package praktikum;
import java.util.Scanner;

public class tugasAsistensi1_07363 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int jumlah07363;
        System.out.print("Masukkan jumlah mata kuliah: ");
        jumlah07363 = scan.nextInt();
        String nama07363[]= new String [jumlah07363];
        int nilai07363[]= new int [jumlah07363];
        double rata07363=0;
        int i07363=0;
        int pilih07363;
        
    do
    {
        System.out.println("Silahkan memilih program di bawah ini!");
        System.out.println("1. Input Mata kuliah dan nilai");
        System.out.println("2. Rata-rata nilai");
        System.out.println("3. Konversi nilai beserta keterangan");
        System.out.println("4. Exit");
        System.out.print("Pilih angka : ");
        pilih07363 = scan.nextInt();
        
        switch(pilih07363)
        {
            case 1:
                scan.nextLine(); 
                do
                {
                    System.out.print("Masukkan nama mata kuliah : ");
                    nama07363[i07363] = scan.nextLine();
                    System.out.print("Masukkan nilai mata kuliah: ");
                    nilai07363[i07363] = scan.nextInt();
                    scan.nextLine();
                    i07363++;
                }
                while(i07363<jumlah07363);
                break;
                
            case 2:
                for(i07363=0;i07363<jumlah07363;i07363++)
                {
                    rata07363=rata07363+nilai07363[i07363];
                }    
                rata07363=rata07363/jumlah07363;
                System.out.println("Rata-rata dari semua matkul adalah: "+rata07363);
                break;
                
            case 3:
                for( i07363=0;i07363<jumlah07363;i07363++)
                {
                    if(nilai07363[i07363]<=100 && nilai07363[i07363]>=90)
                    {
                       System.out.println("Mata kuliah "+nama07363[i07363]+" dengan nilai "+nilai07363[i07363]+ " dinyatakan A (LULUS)");             
                    }
                    else if(nilai07363[i07363]<=89 && nilai07363[i07363]>=75)
                    {
                       System.out.println("Mata kuliah "+nama07363[i07363]+" dengan nilai "+nilai07363[i07363]+ " dinyatakan B (LULUS)");
                    }
                    else if(nilai07363[i07363]<=74 && nilai07363[i07363]>=65)
                    {
                       System.out.println("Mata kuliah "+nama07363[i07363]+" dengan nilai "+nilai07363[i07363]+ " dinyatakan C (LULUS)");
                    }
                    else if (nilai07363[i07363]<=64 && nilai07363[i07363]>=50)
                    {
                       System.out.println("Mata kuliah "+nama07363[i07363]+" dengan nilai "+nilai07363[i07363]+ " dinyatakan D (GUGUR)");
                    }
                    else 
                    {
                       System.out.println("Mata kuliah "+nama07363[i07363]+" dengan nilai "+nilai07363[i07363]+ " dinyatakan E (GUGUR)");                    }
                }
                break;   
            case 4:
                break;         
        }         
    } while (pilih07363<4);
    }
}