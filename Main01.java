import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Simulasi simulasi = new Simulasi();
        //Urutan halaman sengaja saya balik karena saya menggunakan stack yang di mukai dari angka yang paling akhir inputan
        //Oleh karena itu halaman Home saya letakkan di akhir inputan
        simulasi.halamanBaru("Faforite");
        simulasi.halamanBaru("Detail");
        simulasi.halamanBaru("Home");
        simulasi.cetakDaftarHalaman();
        System.out.println();
        simulasi.cetakHalaman();

        simulasi.maju();
        simulasi.maju();
        simulasi.mundur();
        simulasi.mundur();
        simulasi.maju();

        simulasi.cetakHistory();
    }

}