import java.util.Scanner;
public class JgnBodySwimming{
    public static void main(String[] ergs) {
        Scanner input12 = new Scanner(System.in);

        Double BMI;
        Double tinggi, berat;

        System.out.print("Masukkan berat badan anda (kg) : ");
        berat = input12.nextDouble();
        System.out.print("Masukkan tinggi badan anda (cm) : ");
        tinggi = input12.nextDouble();

        BMI = berat / tinggi;

        if ( BMI < 18.5){
            System.out.print("Anda termasuk berbadan kurus");
        } else if ( BMI >= 18.5 && BMI <= 25){
            System.out.print("Anda termasuk berbadan langsing/sehat");
        } else if (BMI >= 25){
            System.out.print("Anda termasuk berbadan gemuk");
        } else {
            System.out.print("tidak valid");
        }

        
    }
}