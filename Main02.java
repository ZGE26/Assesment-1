import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        LinkedList<BarangAntik> listBarang = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Memilih Inputan : \n 1. Input Barang\n 2. Delete Barang\n 3. Melihat List Barang\n 4. Keluar");
            System.out.print("Pilihan :");
            int pilihan = scanner.nextInt();scanner.nextLine();
            if (pilihan == 1) {
                System.out.print("Nama Barang :");
                String nama = scanner.nextLine();
                System.out.println();
                System.out.print("Status Barang :");
                String status = scanner.nextLine();
                System.out.println();

                listBarang.add(new BarangAntik(nama, status));
            } else if (pilihan == 2) {

                ListIterator<BarangAntik> iterator = listBarang.listIterator();
                System.out.print("Hapus Matkul :");

                String masukan = scanner.nextLine();
                while (iterator.hasNext()) {
                    BarangAntik t = iterator.next();
                    if (t.getNamaBarang().equals(masukan)) {
                        iterator.remove();
                    }
                }

            } else if (pilihan == 3) {
                for (BarangAntik barang : listBarang) {
                    // System.out.println(tugas);
                    System.out.println(barang.getNamaBarang() + " adalah barang antik");
                    System.out.println(barang.getStatus() + " adalah status barang antik");
                    System.out.println();
                }

            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Inputan tidak valid");
                continue;
            }
        }
    }
}
