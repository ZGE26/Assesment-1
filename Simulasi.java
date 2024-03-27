import java.util.Stack;
import java.util.ListIterator;

public class Simulasi {
    private Stack maju;
    private Stack mundur;

    public Simulasi() {
        maju = new Stack();
        mundur = new Stack();
    }
    
    public void halamanBaru(String halaman) {
        maju.push(halaman);
        mundur.clear();
    }
    
    public void maju() {
        if (!maju.isEmpty()) {
            mundur.push(maju.pop());
            System.out.println("Maju ke halaman: " + maju.peek());
        }
    }
    
    public void mundur() {
        if (!mundur.isEmpty()) {
            maju.push(mundur.pop());
            System.out.println("Mundur ke halaman: " + maju.peek());
        }
    }
    
    public void cetakHalaman() {
        System.out.println("Halaman saat ini: " + maju.peek());
    }

    public void cetakDaftarHalaman() {
        System.out.println("Daftar Halaman:");
        ListIterator iterator = maju.listIterator(maju.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public void cetakHistory() {
        System.out.println();
        System.out.println("History:");
        System.out.println("History Mundur:");
        ListIterator iterator = maju.listIterator(maju.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println();
        System.out.println("History Maju:");
        iterator = mundur.listIterator(mundur.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}


