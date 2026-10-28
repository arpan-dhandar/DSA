
import java.util.LinkedList;

class HashTable {
    private LinkedList<Integer>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashFunction(int key) {
        return Math.abs(key % size);
    }

    public void insert(int key) {
        int index = hashFunction(key);

        if (!table[index].contains(key)) {
            table[index].add(key);
            System.out.println(key + " inserted at index " + index);
        } else {
            System.out.println(key + " already exists!");
        }
    }

    public boolean search(int key) {
        int index = hashFunction(key);

        if (table[index].contains(key)) {
            System.out.println(key + " found at index " + index);
            return true;
        }

        System.out.println(key + " not found!");
        return false;
    }

    public void delete(int key) {
        int index = hashFunction(key);

        if (table[index].remove(Integer.valueOf(key))) {
            System.out.println(key + " deleted successfully");
        } else {
            System.out.println(key + " not found!");
        }
    }

    public void display() {
        System.out.println("\nHash Table:");

        for (int i = 0; i < size; i++) {
            System.out.print(i + " -> ");

            for (int key : table[i]) {
                System.out.print(key + " -> ");
            }

            System.out.println("null");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HashTable ht = new HashTable(7);

        ht.insert(10);
        ht.insert(20);
        ht.insert(15);
        ht.insert(17);
        ht.insert(24);
        ht.insert(31);

        ht.display();

        ht.search(24);
        ht.search(50);

        ht.delete(17);

        ht.display();
    }
}
