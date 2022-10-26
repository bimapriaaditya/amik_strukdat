import java.util.LinkedList;
import java.util.Queue;


public class App {

    public void queueExample() {

        Queue<Integer> data = new LinkedList<Integer>();

        data.add(101);
        data.add(55);
        data.add(120);
        data.add(90);
        data.add(300);

        System.out.println("Data Awal : " + data);

        System.out.println("Eksekusi Perintah poll() : " + data.poll());
        System.out.println("Menambah Data Baru add(59) : " + data.add(59));
        System.out.println("Menambah Data Baru add(60) : " + data.add(60));
        System.out.println("Menambah Data Baru add(135) : " + data.add(135));

        System.out.println("Data Setelah di Add : " + data);

        System.out.println("Eksekusi Perintah poll() : " + data.poll());
        
        System.out.println("Data Akhir : " + data);

    }   

    public static void main(String[] args) throws Exception {
        new App().queueExample();
    }
}
