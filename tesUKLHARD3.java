import java.util.HashMap;
import java.util.Map;

public class tesUKLHARD3 {
    public static void main(String[] args) {
        // Contoh input array
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        // Menghitung frekuensi
        Map<Integer, Integer> frekuensi = new HashMap<>();
        for (int num : array) {
            frekuensi.put(num, frekuensi.getOrDefault(num, 0) + 1);
        }

        // Menampilkan hasil
        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
    }
}
