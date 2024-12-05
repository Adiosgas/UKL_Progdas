import java.util.HashSet;

public class tesUKLHARD2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5};
        checkForDuplicates(array);
    }

    public static void checkForDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        boolean hasDuplicates = false;

        System.out.print("Array memiliki elemen duplikat: ");
        for (int num : array) {
            if (seen.contains(num)) {
                System.out.print(num + " ");
                hasDuplicates = true;
            } else {
                seen.add(num);
            }
        }

        if (!hasDuplicates) {
            System.out.println("Tidak ada elemen duplikat.");
        } else {
            System.out.println(); // Untuk newline setelah mencetak elemen duplikat
        }
    }
}
