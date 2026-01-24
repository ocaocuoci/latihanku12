import java.util.Scanner;
public class quis1{
    static Scanner sc =new Scanner(System.in);
    
    public static void main(String[] args){
        segitiga();
        dompet();
    }
    public static void segitiga(){
        int a, b, c;

        System.out.print("masukkan panjang sisi A: ");
        a = sc.nextInt();
        System.out.print("masukkan panjang sisi B: ");
        b = sc.nextInt();
        System.out.print("masukkan panjang sisi C: ");
        c = sc.nextInt();

        if ( a == b && b == c){
            System.out.println("Segitiga dengan panjang sisi A: " + a + ", sisi B: " + b + ", sisi C: " + c + " adalah SEGITIGA SAMA SISI"); 
        } else if (a == b || b == c || c == a){
             System.out.println("Segitiga dengan panjang sisi A: " + a + ", sisi B: " + b + ", sisi C: " + c + " adalah SEGITIGA SAMA KAKI"); 
        } else {
             System.out.println("Segitiga dengan panjang sisi A: " + a + ", sisi B: " + b + ", sisi C: " + c + " adalah SEGITIGA SEMBARANGAN"); 
        }
    }
    public static void dompet(){
        double diskon = 0, chasback = 0, sisa, uang, totalBljn, dibyr;
        String hari, dompet;

        System.out.print("Uang yang anda miliki\t\t: ");
        uang = sc.nextDouble();

        System.out.print("Total pembelanjaan\t\t\t: ");
        totalBljn = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Masukkan hari (senin, selasa, rabu, kamis, jumat, sabtu, minggu): ");
        hari = sc.nextLine();

        System.out.print("Vendor dompet digital yang digunakan (ovo/gopay) : ");
        dompet = sc.nextLine();
        

        switch (dompet){
            case "gopay":
                switch(hari){
                    case "senin":
                    chasback = totalBljn * 0.1;
                    break;

                    case "selasa":
                    diskon = totalBljn * 0.1;
                    break;

                    case "rabu":
                    diskon = totalBljn * 0.15;
                    break;

                    case "kamis":
                    chasback = totalBljn * 0.1;
                    break;

                    case "jumat":
                    diskon = totalBljn * 0.1;
                    break;

                    case "sabtu":
                    diskon = totalBljn * 0.15;
                    break;

                    case "minggu":
                    diskon = totalBljn * 0.2;
                    break;

                    default:
                    System.out.println("hari tidak valid");
                    return;
                } 
                switch (dompet){
                    case "ovo":
                        switch(hari){
                            case "senin":
                            diskon = totalBljn * 0.1;
                            break;

                            case "selasa":
                            chasback = totalBljn * 0.15;
                            break;

                            case "rabu":
                            diskon = totalBljn * 0.15;
                            break;

                            case "kamis":
                            diskon = totalBljn * 0.1;
                            break;

                            case "jumat":
                            diskon = totalBljn * 0.15;
                            break;

                            case "sabtu":
                            chasback = totalBljn * 0.1;
                            break;

                            case "minggu":
                            diskon = totalBljn * 0.15;
                            break;

                            default:
                            System.out.println("hari tidak valid");
                            return;
                        }
        
                } 
                break;
                default:
                System.out.println("metode pembayaran tidak valid");
                return;
        } 
        dibyr = totalBljn - diskon + chasback;
        System.out.println("Uang yang harus dibayar: " + dibyr);
        sisa = uang - dibyr;
        System.out.println("Sisa uang yang anda miliki: " + sisa);
       
    }
}