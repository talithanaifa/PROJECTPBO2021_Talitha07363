package pertemuan3_07363;
import java.util.Scanner;
import controller_07363.muridController_07363;
import entity_07363.muridEntity_07363;

public class Pertemuan3_07363 
{
    private static Scanner scan = new Scanner(System.in);
    public static muridController_07363 murid = new muridController_07363();
    public static void main(String[] args) 
    {
        int pil;
        do{
            System.out.println("1. Tambah Data \n2. Update Data \n3. Delete Data \n4. View");
            System.out.print("Masukan Pilihan:");
            pil=scan.nextInt();
            switch (pil){
                case 1 :
                    scan.nextLine();
                    System.out.print("Nama         = ");
                    String nama = scan.nextLine();
                    System.out.print("Nomor Absen  = ");
                    String noabsen = scan.nextLine();
                    System.out.print("Kelas        = ");
                    String kelas = scan.nextLine();
                    System.out.print("Alamat       = ");
                    String alamat = scan.nextLine();
                    murid.insert(nama, noabsen, kelas, alamat);
                    break;
                    
                case 2:
                    int ubah;
                    scan.nextLine();
                    System.out.print("Nomor absen    = ");
                    String absen = scan.nextLine();
                    do
                    {
                        System.out.println("1. Nama \n2. Kelas \n3. Alamat \n0. Exit");
                        System.out.print("Pilih Data yang Ingin Diubah = ");
                        ubah = scan.nextInt();
                        switch(ubah)
                        {
                            case 1:
                                scan.nextLine();
                                System.out.print("Nama  = ");
                                String ubahnama = scan.nextLine();
                                murid.updateNama(ubahnama, absen);
                                break;

                            case 2:
                                scan.nextLine();
                                System.out.print("Kelas = ");
                                String ubahkelas = scan.nextLine();
                                murid.updateKelas(ubahkelas, absen);
                                break;

                            case 3:
                                scan.nextLine();
                                System.out.print("Alamat = ");
                                String ubahalamat = scan.nextLine();
                                murid.updateAlamat(ubahalamat, absen);
                                break;
                        }
                    }while(ubah != 0);
                    break;    
                    
                case 3:
                    scan.nextLine();
                    System.out.print("Masukan Nomor absen yang Ingin Dihapus = ");
                    String hapus = scan.nextLine();
                    murid.delete(hapus);
                    break;
                    
                case 4:
                    scan.nextLine();
                    showData_07363();
            }
        }while (true);
       
    }
    
    static void showData_07363()
    {
        for (muridEntity_07363 muridEntities : murid.getDataMurid())
        {
            System.out.println("-------------------------------------");
            System.out.println("Nama     = " +muridEntities.getNama_07363());
            System.out.println("No Absen = " + muridEntities.getNoabsen_07363());
            System.out.println("Kelas    = " + muridEntities.getKelas_07363());
            System.out.println("Alamat   = " + muridEntities.getAlamat_07363());
            
        }
    }
    
}
