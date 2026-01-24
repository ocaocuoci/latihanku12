import java.util.Scanner;

public class js5{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        yaynay();
        semester();
        pemilihan();
    }
    public static void yaynay(){
        int angka;

        System.out.print("Input angka: ");
        angka = sc.nextInt();

        if (angka % 2 == 0){
            System.out.println("Bilangan Genap");
        }
        else {
            System.out.println("Bilangan Ganjil");
        }
        System.out.println();
    }
    public static void semester(){
        int uas, uts, kuis, tugas;
        Double nilaiAkhir;

        System.out.print("input nilai uas: ");
        uas = sc.nextInt();
        System.out.print("input nilai uts: ");
        uts = sc.nextInt();
        System.out.print("input nilai kuis: ");
        kuis = sc.nextInt();
        System.out.print("input nilai tugas: ");
        tugas = sc.nextInt();

        nilaiAkhir = (int) (0.4 * uas) + (0.3 * uts) + (0.1 * kuis) + (0.2 * tugas);
        System.out.println("nilai akhir = " + nilaiAkhir);

        if (nilaiAkhir > 65){
            System.out.println( nilaiAkhir +"Sehingga tidak remidi");
        } else {
            System.out.println("Anda harus remidi!");
        }
        
        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            System.out.println("A");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
            System.out.println("B+");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
            System.out.println("B");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            System.out.println("C+");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            System.out.println("C");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        System.out.println();
    }
    public static void pemilihan(){
        Double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);

        switch (operator){
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 +" = " + hasil);
            break;

            case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 +" - " + angka2 +" = " + hasil);
            break;

            case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 +" * " + angka2 +" = " + hasil);
            break;

            case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 +" / " + angka2 +" = " + hasil);
            break;

            default:
            System.out.println("Masukkan operator dengan benar");
            break;
        }
    }
}