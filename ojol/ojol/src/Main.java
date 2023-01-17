import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Penumpang numpang = new Penumpang();
        Lokasi lokasi = new Lokasi();
        Driver driver = new Driver();
        Pembayaran byr = new Pembayaran();

        Scanner in = new Scanner(System.in);  //InputStream

        //---------------- PENUMPANG --------------------
        System.out.print("Masukkan nama penumpang : ");
        String namPen = in.nextLine();
        System.out.print("Masukkan nomor Hp penumpang : ");
        int NoHpPen = in.nextInt();
        in.nextLine();
        numpang.getNama(namPen);
        numpang.getNoHp(NoHpPen);
        //-----------------------------------------------



        //----------------- LOKASI ----------------------
        System.out.print("Masukkan Lokasi Awal      : ");
        String LokAwal = in.nextLine();
        System.out.print("Masukkan tujuan anda      : ");
        String tujuan = in.nextLine();
        System.out.print("Masukkan jarak 10000/KM   : ");
        int jarak = in.nextInt();
        numpang.setNama();
        numpang.setNoHp();
        lokasi.getLok_awal(LokAwal);
        lokasi.getTujuan(tujuan);
        lokasi.getJarak(jarak);
        lokasi.lok();
        //----------------------------------------------

        //--------------DRIVER----------------------------
        System.out.println();
        System.out.println("+============ LIST DRIVER ============+");
        System.out.println("|1. Ujang                             |");
        System.out.println("|2. Slamet                            |");
        System.out.println("|3. Rani                              |");
        System.out.println("+=====================================+");
        System.out.print("Silahkan masukkan pilihan anda : ");
        int Pilihan = in.nextInt();
        driver.setPilihan(Pilihan);
        driver.setNama();
        driver.setNoHp();
        driver.driverr();
        //------------------------------------------------

        //------------------- Pembayaran -----------------

        byr.setHarga();
        byr.setJarak(jarak);
        byr.setTot_awal();
        byr.totAwal();

        System.out.println();
        System.out.println("+============ METODE PEMBAYARAN =============+");
        System.out.println("|1  Tunai                                    |");
        System.out.println("|2. Gopay (Diskon 15%)                       |");
        System.out.println("|3. Dana  (Diskon 10%)                       |");
        System.out.println("+============================================+");
        System.out.print("Silahkan masukkan pilihan anda : ");
        int Pilihan2 = in.nextInt();

        byr.total(Pilihan2);
        byr.totall();


        System.out.print("Masukkan uang pembayaran anda : ");
        int uang = in.nextInt();

        byr.setUang_bayar(uang);
        byr.kembailan();


    }
}