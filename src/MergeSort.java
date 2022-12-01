public class MergeSort extends App {
    public void merge(int data[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = data[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = data[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort(int data[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(data, l, m);
            sort(data, m + 1, r);

            merge(data, l, m, r);
        }
    }

    public void main() {
        int array[] = { 7, 23, 18, 10, 7, 21 };
        System.out.println("Tugas 3 : InsertionSort");

        System.out.print("Data Acak : ");
        console.Int(array);
        // Break Space
        System.out.println(" ");

        // Panggil fungsi
        MergeSort ob = new MergeSort();
        ob.sort(array, 0, array.length - 1);

        System.out.print("Hasil Sort : ");
        console.Int(array);
        System.out.println("");
    }
}
