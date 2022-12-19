// Membuat sebuah object field bernama node
class Node 
{
    int data;
    Node left;
    Node right;

    // Constructor Node 
    public Node(int data) 
    {
        this.data = data;        
        this.left = null;
        this.right = null;
    }

}

class BST
{
    // initialisasi field root merupakan sebuah relasi class Node 
    // (artinya variabel root memiliki kerangka info data, left, right)
    Node root;

    // Constructor BST
    public BST()
    {
        this.root = null;
    }

    // Methode ini yang pertamakali di panggil
    public void insert(int data) 
    {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node current, int data)
    {
        // secara default (permanggilan pertama) current diset null dan maka fungsi ini dibaca pertamakali
        if (current == null) {
            System.out.println("Data " + data + " berhasil ditambahkan ke dalam tree");
            // Menyimpan nilai bobot pada sebuah node
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            // value pada data sudah ada & tidak bisa ditambah
            return current;
        }

        return current;
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        int[] input = {19, 10, 34, 8, 12, 23, 47, 3, 9, 11, 28, 39, 52};
        BST binaryBst = new BST();
        for (int i : input) {
            binaryBst.insert(i);
        }
    }
}
