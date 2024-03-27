import java.util.Comparator;

public class BarangAntik {
    public static Comparator namaBarangComparator;
    private String namaBarang;
    private String status;

    public BarangAntik(String namaBarang, String status) {
        this.namaBarang = namaBarang;
        this.status = status;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Daftar Barang{" +
                "Nama Barang : '" + namaBarang + '\'' +
                ", alamat='" + status +'}';
    }

    
}
