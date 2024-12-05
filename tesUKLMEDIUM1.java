import java.util.Scanner;

public class tesUKLMEDIUM1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = scanner.nextInt();
        
        // Memastikan input adalah bilangan bulat positif
        if (n < 0) {
            System.out.println("Bilangan harus positif.");
        } else {
            long faktorial = hitungFaktorial(n);
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
        
        scanner.close();
    }
    
    public static long hitungFaktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}