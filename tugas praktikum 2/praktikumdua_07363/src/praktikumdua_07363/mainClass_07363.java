package praktikumdua_07363;
import java.util.Scanner;

public class mainClass_07363 
{
    private static Scanner input_tasya = new Scanner(System.in);
    private static karyawanGudang_07363[] karyawanGudang_tasya = new karyawanGudang_07363[100];
    private static gudangSepatu_07363[] gudangSepatu_tasya = new gudangSepatu_07363[100];
    private static milihSepatu_07363[] milihSepatu_tasya = new milihSepatu_07363[100];
    private static jenisSepatu_07363[] jenisSepatu_tasya = new jenisSepatu_07363[100];
    private static int indexJenis_tasya;
    private static int pilJenis_tasya;
    private static int jumSepatu_tasya= 0;
    
    public static void main(String[] args)
    {
        dataKaryawan_07363();
        int pil_tasya;
        
        do{
            System.out.println("1. Login Karyawan");
            System.out.println("2. Lihat Stock sepatu");
            
            pil_tasya = input_tasya.nextInt();
            input_tasya.nextLine();
            switch(pil_tasya)
                 {
                case 1:
                    loginKaryawan_07363();
                    break;
                case 2 :
                    viewSepatu_07363();
                    break;
            }
        }while(pil_tasya !=0);
    }
    
    static int dataKaryawan_07363()
    {
        String namaKaryawan_tasya[] = {"Taehyung", "Jungkook", "Jaemin", "Mingyu", "Sunghoon"};
        String passKaryawan_tasya[] = {"01", "02", "03", "04", "05"};
        for (int i_tasya=0;i_tasya<namaKaryawan_tasya.length;i_tasya++)
        {
            karyawanGudang_tasya[i_tasya] = new karyawanGudang_07363(passKaryawan_tasya[i_tasya], namaKaryawan_tasya[i_tasya]);
        }
        return namaKaryawan_tasya.length;
    }
    static void loginKaryawan_07363()
    {
        System.out.println("Nama Karyawan     : ");
        String nama_tasya = input_tasya.next();
        System.out.println("Password Karyawan : ");
        String password_tasya = input_tasya.next();
        int cekKaryawan_07363 = loginKaryawan_07363(nama_tasya, password_tasya);
        System.out.println("Selamat Datang " + karyawanGudang_tasya[cekKaryawan_07363].getNama_tasya());
        int pil_tasya;
        do
        {
            System.out.println("Jumlah Sepatu: "+jumSepatu_tasya);   
            System.out.println("1. Masukkan data-data sepatu");
            System.out.println("2. Ubah data sepatu");
            System.out.println("3. Lihat data sepatu");
            System.out.println("4. Hapus data sepatu");
            System.out.println("0. Log Out");
            pil_tasya = input_tasya.nextInt();
            input_tasya.nextLine();
            switch (pil_tasya)
            {
                case 1:
                    insertSepatu_07363();
                    break;
                case 2 : 
                    updateSepatu_07363();
                    break;
                case 3 : 
                    viewSepatu_07363();
                    break;
                case 4 :
                    deleteSepatu_07363();
                    break;
            }
        }while(pil_tasya!=0); 
    }
    static int loginKaryawan_07363(String nama_tasya, String password_tasya)
    {
        int loop_tasya=0;
        for (int i_tasya=0; i_tasya<=dataKaryawan_07363(); i_tasya++)
        {
            if ( karyawanGudang_tasya[i_tasya].getNama_tasya().equals(nama_tasya) && karyawanGudang_tasya[i_tasya].getPassword_tasya().equals(password_tasya) ) 
        {
            break;
        }
            else
        {
            loop_tasya++;
        }
        }
        return loop_tasya;
    }
    static void insertSepatu_07363()
    {
        System.out.println("Merk sepatu: ");
        String merk_tasya = input_tasya.nextLine();

        System.out.println("Ukuran sepatu: ");
        String ukuran_tasya = input_tasya.nextLine();

        System.out.println("Harga sepatu: ");
        String harga_tasya = input_tasya.nextLine();

        gudangSepatu_tasya[jumSepatu_tasya] = new gudangSepatu_07363(merk_tasya,ukuran_tasya,harga_tasya);
        insertJenis_07363();
    }
    static void insertJenis_07363()
    {
        System.out.println("Jenis Sepatu: ");
        for(int i_tasya=0; i_tasya<jenisSepatu_07363.jenisSepatu_07363.length; i_tasya++) 
        {
            System.out.println(i_tasya + ". " + jenisSepatu_07363.jenisSepatu_07363[i_tasya] );
        }
            System.out.println("Pilih jenis sepatu: ");
            pilJenis_tasya = input_tasya.nextInt();
            System.out.println("Input Kode jenis sepatu: ");
            String kodeSepatu_tasya = input_tasya.next();

            milihSepatu_tasya[jumSepatu_tasya] = new milihSepatu_07363(jenisSepatu_tasya[jumSepatu_tasya],pilJenis_tasya,kodeSepatu_tasya);
            jumSepatu_tasya=jumSepatu_tasya+1;
    }
   static void updateSepatu_07363()
    {
        System.out.print("Masukan merk yang ingin di EDIT: ");
        String search_tasya = input_tasya.next();
        int cari_tasya=0;
        do
        {
           if(cari_tasya==jumSepatu_tasya) 
        {
            System.err.println("Tidak Ada Data");
            break;
        }   
        else if (gudangSepatu_tasya[cari_tasya].getMerk_tasya().equals(search_tasya))
        {
            int pilEdit_tasya;
            do
            {
                System.out.println("Pilih data yang ingin diubah: ");
                System.out.println("1. Lihat data sepatu");
                System.out.println("2. Merk sepatu");
                System.out.println("3. Ukuran sepatu");
                System.out.println("4. Harga sepatu");
                System.out.println("5. Jenis Sepatu");
                System.out.println("0. Exit ");
                pilEdit_tasya = input_tasya.nextInt();
                input_tasya.nextLine();
                if(pilEdit_tasya==1)
                {
                    System.out.println( "Kode Sepatu: " + milihSepatu_tasya[cari_tasya].getKodeSepatu_tasya());
                    System.out.println("===========================================");
                    System.out.println("Merk sepatu: " + gudangSepatu_tasya[cari_tasya].getMerk_tasya()
                                    + "\nUkuran ssepatu: " + gudangSepatu_tasya[cari_tasya].getUkuran_tasya()
                                    + "\nHarga Sepatu: " + gudangSepatu_tasya[cari_tasya].getHarga_07363()
                                    + "\nJenis Sepatu: " + jenisSepatu_07363.jenisSepatu_07363[milihSepatu_tasya[cari_tasya].getIndexJenis_tasya()]);
                    System.out.println("===========================================");
                }
                else if(pilEdit_tasya==2)
                {
                    System.out.print("Ubah merk sepatu: ");
                    String editMerk=input_tasya.nextLine();
                    gudangSepatu_tasya[cari_tasya].setMerk_tasya(editMerk);
                }
                else if (pilEdit_tasya==3)
                {
                    System.out.print("Ubah ukuran sepatu:");
                    String editUkuran=input_tasya.nextLine();
                    gudangSepatu_tasya[cari_tasya].setUkuran_tasya(editUkuran);
                }
                else if (pilEdit_tasya==4)
                {
                    System.out.print("Ubah harga sepatu : ");
                    String editHarga=input_tasya.nextLine();
                    gudangSepatu_tasya[cari_tasya].setHarga_07363(editHarga);
                }
                else if(pilEdit_tasya==5)
                {
                    System.out.println("Pilih jenisSepatu :");
                    for(int i_tasya=0; i_tasya<jenisSepatu_07363.jenisSepatu_07363.length;i_tasya++)
                    {
                        System.out.println(i_tasya+". "+jenisSepatu_07363.jenisSepatu_07363[i_tasya]);
                    }
                }
            }
            while(pilEdit_tasya!=0);
            break;
        }
        else
        {
            cari_tasya=cari_tasya+1;
        }
        }
        while(true);
    }
   static void viewSepatu_07363()
    {
        for(int i_tasya=0;i_tasya<jumSepatu_tasya;i_tasya++)
        {
            System.out.println("Kode Sepatu:"+ milihSepatu_tasya[i_tasya].getKodeSepatu_tasya());
            System.out.println("====================================================");
            System.out.println("merk : "+gudangSepatu_tasya[i_tasya].getMerk_tasya()  + "\nharga : "+gudangSepatu_tasya[i_tasya].getHarga_07363() + "\nukuran : "+gudangSepatu_tasya[i_tasya].getUkuran_tasya()+"\njenis: "+jenisSepatu_07363.jenisSepatu_07363[milihSepatu_tasya[i_tasya].getIndexJenis_tasya()]);
            System.out.println("====================================================");
        }
    }

    static void deleteSepatu_07363()
    {
        System.out.print("Masukkan kode sepatu yang akan di HAPUS :");
        String search_tasya=input_tasya.next();
        input_tasya.nextLine();
        int cari_tasya = 0;
        do
        {
            if(cari_tasya==jumSepatu_tasya)
            {
                System.err.println("Tidak ada Data!");
                break;
            }
            else if(milihSepatu_tasya[cari_tasya].getKodeSepatu_tasya().equals(search_tasya))
            {
                if (cari_tasya==jumSepatu_tasya-1)
                {
                    jumSepatu_tasya=jumSepatu_tasya-1;
                }
                else
                {
                    for(int i_tasya=cari_tasya;i_tasya<jumSepatu_tasya;i_tasya++)
                    {
                        milihSepatu_tasya[i_tasya]=milihSepatu_tasya[i_tasya+1];
                        jenisSepatu_tasya[i_tasya]=jenisSepatu_tasya[i_tasya+1];
                        gudangSepatu_tasya[i_tasya]=gudangSepatu_tasya[i_tasya+1];
                        
                    }
                    jumSepatu_tasya=jumSepatu_tasya-1;
                }
                break;
            }
            else
            {
                cari_tasya=cari_tasya+1;
            }
        }
        while(true);
    }
}

