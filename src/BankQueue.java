import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BankQueue {

    /**
     * @param data
     */
    static void addQueue(String[] data, Queue<String> queue) {
        for (int i = 0; i < data.length; i++) {
            queue.add(data[i]);
        }
    }

    static void doTask(Queue<String> queue, String myQueue) {
        System.out.println("=== MULAI MEMANGGIL ANTRIAN ===");
        Iterator itr = queue.iterator();
        System.out.println("Total Pengunjung : " + queue.size());

        while (itr.hasNext()) {
            if (queue.peek() == myQueue) {
                System.out.println("ANTRIAN ANDA SEKARANG : " + queue.peek() + " (ANDA)");
            } else {
                System.out.println("MEMANGGIL : " + queue.peek());
            }
            queue.poll();
        }
        
        System.out.println("Antrian saat ini : " + queue + "  " + queue.size());
        System.out.println("====== ANTRIAN SELESAI ======");
        
    }

    public static void main(String[] args) throws Exception {

        System.out.println("============ SYSTEM ANATRIAN BANK-U ============");

        String[] initialQueue = {"Tini", "Rohmat", "Budi", "Anya", "Wawan"};
        String[] newQueue = {"Sutrisno Buwono", "Mamat", "Surya", "Tani", "Euis", "Dadang", "Romlah"};
        Queue<String> antrianBank = new LinkedList<String>();

        System.out.println(antrianBank);

        new BankQueue().addQueue(initialQueue, antrianBank);

        System.out.println(antrianBank);

        Scanner yourQueue = new Scanner(System.in);
        System.out.println("Masukan nama anda untuk mendaftar antrian Bank-U");
        String name = yourQueue.nextLine();

        antrianBank.add(name);

        System.out.println("Antrian ke " + antrianBank.size() + " atas nama : " + name + " (Anda)");
        
        new BankQueue().addQueue(newQueue, antrianBank);

        new BankQueue().doTask(antrianBank, name);

    }
}