import java.util.Scanner;
import java.lang.Math;

public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          
        System.out.println("===== Identitas Pengguna =====");
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Nama: ");
        String nama = input.nextLine();
        
        System.out.println("\n===== Masukkan Data Perhitungan =====");
        System.out.print("Masukkan panjang sisi a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan panjang sisi b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan besar sudut gamma (dalam derajat): ");
        double gamma = input.nextDouble();
        
        double gammaRadian = Math.toRadians(gamma);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(gammaRadian));
        
        System.out.println("\n===== Hasil Perhitungan =====");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.printf("Panjang sisi c yang dihitung adalah: %.4f%n", c);
        
        input.close();
    }
}
