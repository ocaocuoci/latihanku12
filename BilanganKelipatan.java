import java.util.Scanner;
public class BilanganKelipatan{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan;

        System.out.print("Masukan bilangan: ");
        bilangan = sc.nextInt();

        if ((bilangan % 3) == 0){
            System.out.print(bilangan + " habis dibagi 3 ");
        } else {
            System.out.print(bilangan + " tidak habis dibagi 3 ");
        }
        
    }
}