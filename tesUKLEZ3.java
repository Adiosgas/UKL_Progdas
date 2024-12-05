import java.util.Scanner;
public class tesUKLEZ3 {

    public static void main(String[] args) {
      // Putaran dari 50 ke 39
      for (int i = 50; i >= 39; i--) {
        // Periksa angkanya genap
        if (i % 2 == 0) {
          System.out.println(i + ". saya anak moklet");
        } else {
          System.out.println(i + ". saya anak wikusama");
        }
        // Periksa angka tersebut habis dibagi 3
        if (i % 3 == 0) {
          System.out.println(i + ". saya angkatan 33");
        }
      }
      System.out.println("1. saya senang");
    }
  } 