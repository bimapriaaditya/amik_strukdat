public class InsertionSort extends App {
    public int[] InsertionSort(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(i + " : ");
            int current = data[i];
            int j = i - 1;
            System.out.print("|" + current + "| ");
            while (j >= 0 && current < data[j]) {
                data[j + 1] = data[j];
                System.out.print(data[j] + ", ");
                j--;
            }
            data[j + 1] = current;
            System.out.println(" ");
        }

        return data;

    }

    public void main() {
        int array[] = { 7, 23, 18, 10, 7, 21 };
        System.out.println("Tugas 3 : InsertionSort");

        System.out.print("Data Acak : ");
        console.Int(array);
        // Break Space
        System.out.println(" ");

        // Panggil fungsi
        System.out.println("=== PROSESS ===");
        array = InsertionSort(array);
        System.out.println("=== END-PROSESS ===");

        System.out.print("Hasil Sort : ");
        console.Int(array);
    }
}
