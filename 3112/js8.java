import java.util.Scanner;
public class js8{
    static Scanner oca =new Scanner(System.in);

    public static void main (String[] args){
        System.out.print("Input nilai n: ");
        int n = oca.nextInt();

        star12(n);
        persegi12(n);
        segitiga12(n);
        siakad12();
        kotak12(n);
        porseni12();
    }
    public static void star12(int n){
        for (int a = 1; a <= n; a++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("----------------");
        
    }
    public static void persegi12(int n){
        for (int a = 1; a <= n; a++){
            for (int b = 1; b<= n; b++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }
    public static void segitiga12(int n){
        int a = 0;
        while (a <= n){
            int b = 0;
            while (b < a){
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
        }
        System.out.println();
        System.out.println("--------------");
    }
    public static void siakad12(){
        int a, b, nilai;
        float totalNilai, rataNilai;

        a = 1;
        while (a <= 5){
            totalNilai = 0;
            System.out.println("Nilai mhs ke-" + a + ": ");
            for (b = 1; b <= 5; b++){
            System.out.print("nilai ke-" + b + " = ");
            nilai = oca.nextInt();
            totalNilai += nilai;
        }
        rataNilai = totalNilai/5;
        System.out.println("Rata rata nilai mahasiswa ke-" + a + " = " + rataNilai);
        a++;
        }
        System.out.println();
    }
    public static void kotak12(int n){
        for( int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void porseni12(){
        for (int i = 1; i <= 4; i++){
            System.out.print("Masukkan cabor yang didaftarkan: ");
            String cabor = oca.nextLine();

            System.out.println("cabang olahraga " + cabor);

            for(int j = 1; j <= 5; j++){
                System.out.println("Input nama atlet ke-" + j + ": ");
                String nama1 = oca.nextLine();
                System.out.print("   atlet ke-" + j + ": " + nama1);
            }
        }
        
    }
    

}