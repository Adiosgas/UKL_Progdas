import java.util.Scanner;
public class tesUKLEZ1 {
    
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = A.nextInt();

        // Menentukan apakah bilangan tersebut ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        // Menutup scanner
        A.close();
    }
}

