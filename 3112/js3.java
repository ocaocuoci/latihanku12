import java.util.Scanner;
public class js3{
    
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
     
        ContohVariabel12();
        ContohTipeData();
        ContohOperator();
        segitiga12();
        Bank12();
    }
    public static void ContohVariabel12(){
        String salahSatuHobiSayaAdalah = "Bermain mobile legend";
        boolean isPandai = true;
        char jenisKelamin = 'P';
        byte _umurSayaSekarang = 20;
        double $ipk = 3.24, tinggi = 1.78;
        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis Kelamin " + jenisKelamin);
        System.out.println("Umurku saat ini: " + _umurSayaSekarang);
        System.out.printf("Saya ber-IPK %s, dengan tinggi badan %s\n", $ipk, tinggi);
        System.out.println();
    }
    public static void ContohTipeData(){
        char golonganDarah = 'O';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDunia = 1025;
        float suhu = 60.50f;
        double berat = 0.123456;
        long saldo = 1500000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan Darah\t\t\t\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t\t\t\t\t: " + jarak);
        System.out.println("Jumlah penduduk dalam satu dunia\t: " + jumlahPendudukDalamSatuDunia);
        System.out.println("Suhu\t\t\t\t\t: " + suhu);
        System.out.println("Berat\t\t\t\t\t: " + (float) berat);
        System.out.println("saldo\t\t\t\t\t: " + saldo);
        System.out.println("angka desimal\t\t\t\t: " + angkaDesimal);
        System.out.println();
    }
    public static void ContohOperator(){
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah evaluasi, x = " + x);
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("Setelah evaluasi, x = " + x);
        int y = 12;
        System.out.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.out.println("Hasil x ^ y adalah " + z);
        z %= 2;
        System.out.println("Hasil akhir " + z);
        System.out.println();
    }
    public static void segitiga12(){

        System.out.print("Masukkan nilai alas: ");
        int alas = sc.nextInt();
        System.out.print("Masukkan nilai tinggi: ");
        int tinggi = sc.nextInt();
        float luas = (float) alas * tinggi / 2;
        System.out.println("Hasil perhitungan luas: " + luas);
        System.out.println();
    }
    public static void Bank12(){
        int jmlTabAwal, lamaMenabung;
        double prosentaseBunga = 0.02, bunga, jmlTabAkhir;

        System.out.print("Masukkan jumlah tabungan awal anda: ");
        jmlTabAwal = sc.nextInt();

        System.out.print("Masukkan lama menabung anda: ");
        lamaMenabung = sc.nextInt();

        bunga = lamaMenabung * prosentaseBunga * jmlTabAwal;
        jmlTabAkhir = bunga + jmlTabAwal;

        System.out.println("Bunganya: " + bunga);
        System.out.println("Jumlah tabungan akhir anda: " + jmlTabAkhir);
    }
}