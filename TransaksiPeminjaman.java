
package tugaspbo_kel6;

public class TransaksiPeminjaman {
    private String nama;
    private String tanggal;
    private int durasi;
    private AnggotaPerpustakaan anggota;
    private Buku buku;

    public TransaksiPeminjaman(String nama, String tanggal, int durasi, AnggotaPerpustakaan anggota, Buku buku) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.anggota = anggota;
        this.buku = buku;
    }

    
     public void catatPeminjaman() {
        System.out.println("Catatan Peminjaman");
         System.out.println("Nama Peminjam: " + nama);
        System.out.println("Tanggal Peminjaman: " + tanggal);
        System.out.println("Durasi Peminjaman (hari): " + durasi);
        System.out.println( "Nomor Anggota: "+ anggota.getNomorAnggota());
        System.out.println("Buku: " + buku.getJudul() + " (Pengarang: " + buku.getPengarang() + ")");
    }

    public String getNama() {
        return nama;
    }
     

    public String getTanggal() {
        return tanggal;
    }

    public int getDurasi() {
        return durasi;
    }

    public AnggotaPerpustakaan getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
  
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void setAnggota(AnggotaPerpustakaan anggota) {
        this.anggota = anggota;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    
}
