import java.util.Scanner;
public class Generasi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, generasi;
        int tahun;

        System.out.print("Siapa namamu? ");
        nama = sc.nextLine();
        System.out.print("Tahun berapakah anda lahir? ");
        tahun = sc.nextInt();

        if (tahun >= 1944 && tahun <= 1964){
            generasi = "Baby boomer";
            System.out.print(nama + ",berdasarkan tahun lahir anda tergolong generasi " + generasi);
        } 
         else if  (tahun >= 1965 && tahun <= 1979){
            generasi = "X";
            System.out.print(nama + ",berdasarkan tahun lahir anda tergolong generasi " + generasi);
        } 
        else if  (tahun >= 1980 && tahun <= 1994){
            generasi = "Y (milenial)";
            System.out.print(nama + ",berdasarkan tahun lahir anda tergolong generasi " + generasi);
        } 
        else if  (tahun >= 1995 && tahun <= 2015){
            generasi = "Z";
            System.out.print(nama + ",berdasarkan tahun lahir anda tergolong generasi " + generasi);
        } else {
            System.out.print("Anda masih piyik");
        }

       
        
    }
}