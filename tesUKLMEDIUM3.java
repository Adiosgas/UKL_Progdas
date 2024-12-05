import java.util.Random;
import java.util.Scanner;

public class tesUKLMEDIUM3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continueQuiz = "y";

        while (continueQuiz.equalsIgnoreCase("y")) {
            // Generate dua bilangan acak
            int bilanganPertama = random.nextInt(100); // Bilangan pertama antara 0-99
            int bilanganKedua = random.nextInt(100); // Bilangan kedua antara 0-99

            // Pilih operator secara acak
            String[] operators = {"+", "/", "%"};
            String operator = operators[random.nextInt(operators.length)];

            // Hitung hasil berdasarkan operator
            double hasil = 0;
            String soal = bilanganPertama + " " + operator + " " + bilanganKedua + " = ?";

            // Tampilkan soal
            System.out.println(soal);
            System.out.print("Jawaban Anda: ");

            // Jika operator adalah pembagian, pastikan tidak membagi dengan nol
            if (operator.equals("/")) {
                while (bilanganKedua == 0) {
                    bilanganKedua = random.nextInt(100);
                }
                hasil = (double) bilanganPertama / bilanganKedua;
            } else if (operator.equals("%")) {
                while (bilanganKedua == 0) {
                    bilanganKedua = random.nextInt(100);
                }
                hasil = bilanganPertama % bilanganKedua;
            } else if (operator.equals("+")) {
                hasil = bilanganPertama + bilanganKedua;
            }

            // Baca jawaban pengguna
            String input = scanner.nextLine();

            // Cek apakah pengguna ingin menghentikan kuis
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Kuis dihentikan.");
                break;
            }

            // Validasi jawaban
            try {
                double jawabanPengguna = Double.parseDouble(input);
                if (jawabanPengguna == hasil) {
                    System.out.println("Jawaban Anda benar!");
                } else {
                    System.out.println("Jawaban Anda salah. Hasil yang benar adalah: " + hasil);
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka atau ketik 'stop' untuk menghentikan kuis.");
            }

            // Tanya pengguna apakah ingin melanjutkan
            System.out.print("Apakah Anda ingin melanjutkan kuis? (y/n): ");
            continueQuiz = scanner.nextLine();
        }

        scanner.close();
    }
}