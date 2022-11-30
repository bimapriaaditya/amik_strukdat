import java.util.*;

public class Tugas {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Initialisasi ArrayList
        ArrayList Mahasiswa = new ArrayList();

        // Tambah data ke ArrayList
        Mahasiswa.add("Bima Pria Aditya");
        Mahasiswa.add(2242807);
        Mahasiswa.add("Bandung");
        Mahasiswa.add("Tugas = 85");
        Mahasiswa.add("UTS = 90");
        Mahasiswa.add("UAS = 85");

        // Menampilkan Seluruh data
        System.out.println("Menampilkan data : " + Mahasiswa);

        // Mencari value "Tugas = 85" terdapat pada index ke berapa
        int tugas_index = Mahasiswa.indexOf("Tugas = 85");
        // Hapus value sesuai index yg terlah dijumpai
        Mahasiswa.remove(tugas_index);

        // Menampilkan data
        System.out.println("Hapus Tugas : " + Mahasiswa);

        // Menghapus index ke 2 (alamat)
        Mahasiswa.remove(2);

        // Menampilkan data
        System.out.println("Hapus Index 2 : " + Mahasiswa);

        // Update Data
        Mahasiswa.set(3, "Gibran Al Fartih");
        Mahasiswa.add(22005);

        System.out.println("Update Data : " + Mahasiswa);

        // Hapus Data
        Mahasiswa.removeAll(Mahasiswa);
        System.out.println("Hapus : " + Mahasiswa);
    }

}