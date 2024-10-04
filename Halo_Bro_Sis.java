import java.util.Scanner;
public class Halo_Bro_Sis{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        String nama, gender;

        System.out.print("Masukkan nama lengkap anda: ");
        nama = sc.nextLine();
        System.out.print("Anda Pria/Wanita: ");
        gender = sc.nextLine();

        if (gender.equalsIgnoreCase("pria")){
            System.out.print("Halo bro " + nama );
        } else if (gender.equalsIgnoreCase("wanita")){
            System.out.print("Halo sis " + nama );
        } else {
            System.out.print("Masukkan gender dengan benar!");
        }
        
    }
}