import java.util.Scanner;
public class js4{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args){

        lingkaran12();
        Gaji12();
        buku12();

    }
    public static void lingkaran12(){
        int r;
        Double keliling, luas;

        System.out.print("Masukkan nilai jari jari: ");
        r = sc.nextInt();

        keliling = 2 * 3.14 * r;
        luas = 3.14 * r * r;

        System.out.println("Kelilingin = " + keliling);
        System.out.println("Luas\t = " + keliling);
        System.out.println();
    }
    public static void Gaji12() {
        int jmlMasuk, jmlTidakMasuk, totGaji;
        int gaji = 40000, potGaji = 25000;

        System.out.print("Input jumlah hari masuk anda: ");
        jmlMasuk = sc.nextInt();

        System.out.print("Inputkan jumlah hari tidak masuk: ");
        jmlTidakMasuk = sc.nextInt();

        totGaji = (jmlMasuk * gaji) - (jmlTidakMasuk * potGaji);
        System.out.println("Total gaji yang didapat = " + totGaji);
        System.out.println();
    }
    public static void buku12(){
        int hrgBuku, jmlBuku;
        Double total, pot = 0.1, totalbrsh;

        System.out.println("===== Toko ATK =====");
        System.out.print("Masukkan jumlah buku: ");
        jmlBuku = sc.nextInt();

        System.out.print("Masukkan harga buku (per lusin): ");
        hrgBuku = sc.nextInt();

        total = (jmlBuku * hrgBuku) * pot;
        totalbrsh = (jmlBuku * hrgBuku) - total;
        System.out.println("total yang perlu dibayarkan: " + totalbrsh);
        System.out.println();
    }
}