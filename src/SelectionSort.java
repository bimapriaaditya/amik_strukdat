public class SelectionSort extends App {
    public int[] SelectionSort(int data[]) {
        int temp;
        for (int i = 0; i < data.length - 1; i++) {
            temp = i;
            System.out.print(i + " : ");
            for (int j = i + 1; j < data.length; j++) {
                System.out.print(data[j] + " < " + data[temp] + ", ");
                if (data[j] < data[temp]) {
                    temp = j;
                    // print nilai true terkecil setiap perbandingan pada looping
                    System.out.print("|" + data[temp] + "| ");
                }
            }
            int less = data[temp];
            data[temp] = data[i];
            data[i] = less;

            System.out.println(" ");
        }
        return data;
    }

    public void main() {
        int array[] = { 7, 23, 18, 10, 7, 21 };
        System.out.println("Tugas 2 : Selection Sort");

        System.out.print("Data Acak : ");
        console.Int(array);
        // Break Space
        System.out.println(" ");

        // Panggil fungsi
        System.out.println("=== PROSESS ===");
        array = SelectionSort(array);
        System.out.println("=== END-PROSESS ===");

        System.out.print("Hasil Sort : ");
        console.Int(array);
    }
}
