public class BubbleSort extends App {
    public int[] BubbleSort(int data[]) {
        int n, temp;
        n = data.length;

        // int tmp = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j < (n - i); j++) {
                // check apabila data ke n > data n+1
                System.out.print(data[j - 1] + " > " + data[j]);
                if (data[j - 1] > data[j]) {
                    System.out.print(" || ");
                    // Switch data
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                } else {
                    System.out.print(", ");
                }
            }
            System.out.println(" ");
        }
        return data;
    }

    public void main() {
        int array[] = { 8, 23, 18, 10, 7, 21 };
        System.out.println("Tugas 1 : Bubble Sort");

        System.out.print("Data Acak : ");
        console.Int(array);
        // Break Space
        System.out.println(" ");

        // Panggil fungsi
        System.out.println("=== PROSESS ===");
        array = BubbleSort(array);
        System.out.println("=== END-PROSESS ===");

        System.out.print("Hasil Sort : ");
        console.Int(array);
    }
}
