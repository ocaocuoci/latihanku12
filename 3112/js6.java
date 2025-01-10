import java.util.Scanner;
public class js6{
    static Scanner sc =new Scanner(System.in);

    public static void main (String[] args){
        kabisat();
        segitiga();
        gaji();
    }
    public static void kabisat(){
        int tahun;
        System.out.print("inputkan tahun: ");
        tahun = sc.nextInt();

        if (tahun % 4 == 0){
            if (tahun % 100 != 0 && tahun % 400 != 0){
                System.out.println("tahun kabisat");
            }
        } else {
            System.out.println("bukan tahun kabisat");
        }
        System.out.println();
    }
    public static void segitiga(){
        float sudut1, sudut2, sudut3, total;

        System.out.print("Inputkan sudut pertama: ");
        sudut1 = sc.nextFloat();
        System.out.print("Inputkan sudut kedua: ");
        sudut2 = sc.nextFloat();
        System.out.print("Inputkan sudut ketiga: ");
        sudut3 = sc.nextFloat();

        total = sudut1 + sudut2 + sudut3;
        System.out.println("total sudut : " + total);
        if (total == 180){
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90){
                System.out.println("Segitga siku siku");
            } else {
                System.out.println(" segitiga sembarang ");
            }
        }
        else if (sudut1 == sudut3){
                System.out.println("segitiga sama kaki");
        }
        
        System.out.println();
    }
    public static void gaji(){
        String kategori;
        int penghasilan;
        double pajak = 0, gajiBersih;

        System.out.println("masukkan kategori (pekerja/ pebisnis): ");
        kategori = sc.nextLine();

        System.out.println("masukkan besaran gaji: ");
        penghasilan = sc.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000){
                pajak = 0.1;
            }
            else if (penghasilan <= 3000000){
                pajak = 0.15;
            } else {
                pajak = 0.2;
                gajiBersih = penghasilan - (penghasilan * pajak);
                System.out.println("gaji bersih: " + gajiBersih); 
            }
        } 
        else if (kategori.equalsIgnoreCase("pebisnis")){
            if (penghasilan <= 2500000){
                pajak = 0.15;
            } else if (penghasilan <= 3500000){
                pajak = 0.2;
            } else {
                pajak = 0.25;
                gajiBersih = penghasilan - (penghasilan * pajak);
                System.out.println("gaji bersih: " + gajiBersih);
            }
        } 
        

    }


}